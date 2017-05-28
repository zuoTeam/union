package com.zuo.union.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.zuo.union.domain.PageBean;
import com.zuo.union.domain.Travel;
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
	public ModelAndView gotoTravel(int currentItemCount) {
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
	
	public ModelAndView toViewAllTravel(int currentPage) {
		ModelAndView modelAndView = new  ModelAndView();
		modelAndView.setViewName("user/travel");
		try {
			List<Travel> allTravels = travelService.getAllTravels();
			PageBean<Travel> pageBean = new PageBean<Travel>(currentPage, allTravels.size(), 5);
			pageBean.setList(travelService.getTravelsByPage(pageBean));
			modelAndView.addObject("pageBean", pageBean);
		} catch (Exception e) {
			modelAndView.addObject("errorMsg", "错误：请联系客服400:)!");
			e.printStackTrace();
		}
		return modelAndView;
	}
}
