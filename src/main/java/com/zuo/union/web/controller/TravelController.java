package com.zuo.union.web.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.zuo.union.domain.AttendTravel;
import com.zuo.union.domain.PageBean;
import com.zuo.union.domain.Travel;
import com.zuo.union.domain.User;
import com.zuo.union.service.TravelService;
import com.zuo.union.service.entity.ItemChooseBean;

/**
 * 结伴出行控制器
 * @author Yao
 *
 */
@Controller
public class TravelController {
	
	@Autowired
	private TravelService travelService;
	
	@RequestMapping("/gotoTravel")
	public ModelAndView gotoTravel(int currentItemCount) {//查看当前发布的出行记录
		ModelAndView modelAndView = new  ModelAndView();
		modelAndView.setViewName("user/travel");
		try {
			List<Travel> allTravels = travelService.getAllTravels();
			modelAndView.addObject("travel", allTravels.get(currentItemCount));//获取当前出行条目信息
			modelAndView.addObject("itemChooseBean", new ItemChooseBean(currentItemCount, allTravels.size()));
		} catch (Exception e) {
			modelAndView.addObject("errorMsg", "错误：请联系客服400:)!");
			e.printStackTrace();
		}
		return modelAndView;
	}
	
	@RequestMapping("/toViewAllTravels")
	public ModelAndView toViewAllTravel(int currentPage,HttpServletRequest request) {
		ModelAndView modelAndView = new  ModelAndView();
		modelAndView.setViewName("user/travel");
		try {
			List<Travel> allTravels = travelService.getAllTravels();
			PageBean<Travel> pageBean = new PageBean<Travel>(currentPage, allTravels.size(), 5);
			pageBean.setList(travelService.getTravelsByPage(pageBean));
			modelAndView.addObject("pageBean", pageBean);
			
			//获取当前user对象，遍历该用户参与的结伴出行记录
			/*User user = (User) request.getSession().getAttribute("user");
			List<AttendTravel> attendTravels = new ArrayList<AttendTravel>();
			AttendTravel attendTravel = new AttendTravel();
			for (Travel travel : allTravels) {
				if (travelService.checkIsAttend(travel.getTravelId(), user.getUserId())>0) {
					attendTravel.setTravel(travel);
					attendTravel.setUser(user);
					attendTravels.add(attendTravel);
				}
			}
			modelAndView.addObject("attendTravels", attendTravels);*/
		} catch (Exception e) {
			modelAndView.addObject("errorMsg", "错误：请联系客服400:)!");
			e.printStackTrace();
		}
		return modelAndView;
	}
	
	@RequestMapping(value="/toBePartner",produces="text/html;charset=utf-8")
	@ResponseBody
	public String toBePartner(Long attendUserId,Integer travelId){
		String resultMsg = "";
		try {
			int result = travelService.toBePartner(travelId, attendUserId);
			if (result>0) {
				resultMsg="恭喜！成功加入本次结伴出行！";
			}else if (result==-1) {
				resultMsg="亲!你已经加入过本次出行！";
			}else{
				resultMsg="Sorry!您未能加入本次结伴出行！";
			}
		} catch (Exception e) {
			resultMsg="错误：请联系客服400:)!";
			e.printStackTrace();
		}
		return resultMsg;
	}
	
	@RequestMapping("/issueTravel")
	public ModelAndView issueTravel(String issueTitle,String issueTravelPlace,String issueTravelTime,String issueTravelContent,
									@RequestParam("issueImages") MultipartFile[] issueImages,HttpServletRequest request){
		System.out.println("issueTitle="+issueTitle);
		System.out.println("issueTravelPlace="+issueTravelPlace);
		System.out.println("issueTravelTime="+issueTravelTime);
		System.out.println("issueTravelContent="+issueTravelContent);
		
		//获取当前用户，标记本次结伴出行发布人
		User user = (User) request.getSession().getAttribute("user");
		
		Travel travel = new Travel();
		travel.setUser(user);
		travel.setTravelTitle(issueTitle);
		travel.setTravelPlace(issueTravelPlace);
		
		if (issueTravelTime.contains("T")) {
			issueTravelTime = issueTravelTime.replace("T", " ");//从页面上获取的日期与实间中有一个字符（“T”），用空字符替代
		}
		
		travel.setTravelContent(issueTravelContent);
		try {
			travel.setTravelTime(new SimpleDateFormat("yyyy-MM-dd HH:mm").parse(issueTravelTime));
			
			List<String> imagePaths = new ArrayList<String>();
			
			if(issueImages!=null && issueImages.length>0){  
				//循环获取images数组中得文件  
				for (MultipartFile image : issueImages) {
					//保存文件  
					System.out.println("图片保存路径："+saveFile(image,request)); 
					imagePaths.add(saveFile(image,request));
				}
			}  
			travelService.issueTravelAndUploadImgs(travel, imagePaths);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return gotoTravel(1);
	}
	
	/*** 
     * 保存文件 
     * @param file 
     * @return 
     */  
    private String saveFile(MultipartFile mpfile,HttpServletRequest request) {  
        // 判断文件是否为空  
        if (!mpfile.isEmpty()) {  
            try {  
                //文件上传的服务器目录的uploadFiles路径
    			String uploadFilesPath = request.getServletContext().getRealPath("/uploadImages/travelImgs");
    			//确立好上传到服务器中的（路径+文件名）
    			File file = new File(uploadFilesPath, mpfile.getOriginalFilename());
    			
    			File parentFile = file.getParentFile();
    			
    			//如果目录uploadImages不存在，则创建一个
    			if (!parentFile.exists()) {
    				parentFile.mkdirs();
    			}
    			
    			//声明文件字节流
    			OutputStream os = new FileOutputStream(file);
    			
    			IOUtils.copy(mpfile.getInputStream(), os);
    			os.close();
    			
                return "uploadImages/travelImgs/"+file.getName();  
            } catch (Exception e) {  
                e.printStackTrace();  
            }  
        }  
        return null;  
    } 
}
