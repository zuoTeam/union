package com.zuo.union.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.zuo.union.domain.PageBean;
import com.zuo.union.domain.Travel;
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

	@Override
	public List<Travel> getAllTravels() throws Exception {
		return travelMapper.getAllTravels();
	}

	@Override
	public List<Travel> getTravelsByPage(PageBean<Travel> pageBean)
			throws Exception {
		return travelMapper.getTravelsByPage(pageBean);
	}

	
}
