package com.zuo.union.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zuo.union.domain.Letter;
import com.zuo.union.domain.PageBean;
import com.zuo.union.domain.RentedHouse;
import com.zuo.union.domain.Type;
import com.zuo.union.mapper.RentMapper;
import com.zuo.union.service.RentService;

@Service
public class RentServiceImpl implements RentService{
	
	@Autowired
	private RentMapper rentMapper;

	@Override
	public List<RentedHouse> getRentedHouse(String keyWord, PageBean<RentedHouse> pageBean, Type type)
			throws Exception {
		Map<String, Object> map = new HashMap<>();
		map.put("keyWord", keyWord);
		map.put("pageBean", pageBean);
		map.put("type", type);
		return rentMapper.getRentedHouse(map);
	}

	@Override
	public int getRentedHouseRows(String keyWord, Type type) throws Exception {
		Map<String, Object> map = new HashMap<>();
		map.put("keyWord", keyWord);
		map.put("type", type);
		return rentMapper.getRentedHouseRows(map);
	}

	@Override
	public int addRentHouse(RentedHouse rentedHouse) throws Exception {
		return rentMapper.addRentHouse(rentedHouse);
	}

	@Override
	public int addLetter(Letter letter) throws Exception {
		return rentMapper.addLetter(letter);
	}

	@Override
	public List<Type> getRentedHouseTypes() throws Exception {
		return rentMapper.getRentedHouseTypes();
	}

}
