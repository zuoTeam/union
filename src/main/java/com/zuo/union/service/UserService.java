package com.zuo.union.service;

import com.zuo.union.domain.User;

public interface UserService {
	
	/**
	 * 用户登录
	 * @param userName
	 * @param userPass
	 * @return
	 * @throws Exception
	 */
	public User login(String userName,String userPass) throws Exception;
}
