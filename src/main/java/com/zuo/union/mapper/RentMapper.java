package com.zuo.union.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.zuo.union.domain.Letter;
import com.zuo.union.domain.RentedHouse;
import com.zuo.union.domain.Type;

@Repository
public interface RentMapper {

	/**
	 * QBC获取出租房屋的信息
	 * @param map
	 * @return
	 * @throws Exception
	 */
	List<RentedHouse> getRentedHouse(Map<String, Object> map) throws Exception;
	
	
	/**
	 * QBC获取出租房屋的条目数
	 * @param map
	 * @return
	 * @throws Exception
	 */
	int getRentedHouseRows(Map<String, Object> map) throws Exception;
	
	/**
	 * 发布出租房屋信息
	 * @param map
	 * @return
	 * @throws Exception
	 */
	int addRentHouse(RentedHouse rentedHouse) throws Exception;
	
	/**
	 * 租客向房东发送站内信
	 * @return
	 * @throws Exception
	 */
	int addLetter(Letter letter) throws Exception;
	
	/**
	 * 获取所有出租房屋的类型
	 * @return
	 * @throws Exception
	 */
	List<Type> getRentedHouseTypes() throws Exception;
	
}
