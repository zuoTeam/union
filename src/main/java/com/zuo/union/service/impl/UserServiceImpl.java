package com.zuo.union.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.zuo.union.domain.User;
import com.zuo.union.mapper.UserMapper;
import com.zuo.union.service.UserService;

@Transactional(propagation=Propagation.REQUIRED,rollbackFor=Exception.class)
@Service("userService")
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserMapper userMapper;
	
	@Transactional(propagation=Propagation.SUPPORTS,readOnly=true)
	public User login(String userName, String userPass) throws Exception {
		Map<String, String> loginParams = new HashMap<String, String>();
		loginParams.put("userName", userName);
		loginParams.put("userPass", userPass);
		return userMapper.login(loginParams);
	}

}
