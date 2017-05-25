package com.zuo.union.mapper;

import java.util.Map;

import org.springframework.stereotype.Repository;

import com.zuo.union.domain.User;

@Repository("userDao")
public interface UserMapper {

	/**
	 * 用户登录
	 * @param loginParams
	 * @return
	 * @throws Exception
	 */
	public User login(Map<String, Object> loginParams) throws Exception;
}
