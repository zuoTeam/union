package com.zuo.union.mapper;

import java.util.Map;

import org.springframework.stereotype.Repository;

import com.zuo.union.domain.User;

@Repository("userMapper")
public interface UserMapper {

	/**
	 * 用户登录
	 * @param loginParams
	 * @return
	 * @throws Exception
	 */
	public User login(Map<String, String> loginParams) throws Exception;
	
	
	/**
	 * 用户注册
	 * @param user
	 * @return
	 * @throws Exception
	 */
	public int register(User user) throws Exception;
}
