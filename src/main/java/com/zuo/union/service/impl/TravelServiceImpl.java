package com.zuo.union.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.zuo.union.domain.PageBean;
import com.zuo.union.domain.Travel;
import com.zuo.union.mapper.ImageMapper;
import com.zuo.union.mapper.TravelMapper;
import com.zuo.union.service.TravelService;

/**
 * 结伴出行业务层实现类
 * @author Yao
 *
 */
@Transactional(propagation=Propagation.REQUIRED,rollbackFor=Exception.class)
@Service("travelService")
public class TravelServiceImpl implements TravelService {
	
	@Autowired
	private TravelMapper travelMapper;
	
	@Autowired
	private ImageMapper imageMapper;
	
	@Transactional(propagation=Propagation.SUPPORTS,readOnly=true)
	@Override
	public List<Travel> getTopThreeTravels() throws Exception {
		return travelMapper.getTopThreeTravels();
	}
	
	@Transactional(propagation=Propagation.SUPPORTS,readOnly=true)
	@Override
	public Travel getTravelById(Integer travelId) throws Exception {
		return travelMapper.getTravelById(travelId);
	}
	
	@Transactional(propagation=Propagation.SUPPORTS,readOnly=true)
	@Override
	public List<Travel> getAllTravels() throws Exception {
		return travelMapper.getAllTravels();
	}

	@Transactional(propagation=Propagation.SUPPORTS,readOnly=true)
	@Override
	public List<Travel> getTravelsByPage(PageBean<Travel> pageBean)
			throws Exception {
		return travelMapper.getTravelsByPage(pageBean);
	}

	@Override
	public int toBePartner(Integer travelId,Long userId) throws Exception {
		Map<String, Object> attendTravelMap = new HashMap<String, Object>();
		attendTravelMap.put("travelId", travelId);
		attendTravelMap.put("userId", userId);
		
//		用户加入某项出行活动时先检查改用户是否已经参与本项活动，以免重复加入
		if (travelMapper.checkIsAttend(attendTravelMap)>0) {//查询结果大于0，在表示参加过
			return -1;//返回-1表示该用户已经参与过本项活动
		}else {
			return travelMapper.toBePartner(attendTravelMap);
		}
	}

	@Override
	public int checkIsAttend(Integer travelId,Long userId) throws Exception {
		Map<String, Object> attendTravelMap = new HashMap<String, Object>();
		attendTravelMap.put("travelId", travelId);
		attendTravelMap.put("userId", userId);
		return travelMapper.checkIsAttend(attendTravelMap);
	}

	@Override
	public int issueTravelAndUploadImgs(Travel travel, List<String> imagePaths)
			throws Exception {
		int count=0;
		//插入结伴出行信息
		count += travelMapper.issueTravel(travel);
		
		Map<String, Object> imageMap = new HashMap<String, Object>();
		imageMap.put("funcId", 4);//travel类对应功能编号是4
		imageMap.put("travelId", travel.getTravelId());//获取插入的出行id
		
		if (null!=imagePaths && imagePaths.size()>0) {
			for (String imagePath : imagePaths) {
				imageMap.put("imagePath", imagePath);
				count += imageMapper.uploadImgs(imageMap);
			}
		}
		return count;
	}

	
}
