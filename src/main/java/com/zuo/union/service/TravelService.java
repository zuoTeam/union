package com.zuo.union.service;

import java.util.List;

import com.zuo.union.domain.PageBean;
import com.zuo.union.domain.Travel;

/**
 * 结伴出行业务层接口
 * @author Yao
 *
 */
public interface TravelService {
	
	/**
	 * 获取最新发布结伴出行的3条信息
	 * @return
	 * @throws Exception
	 */
	public List<Travel> getTopThreeTravels() throws Exception;
	
	/**
	 * 通过tavelId查询结伴出行的详细信息
	 * @param travelId
	 * @return
	 * @throws Exception
	 */
	public Travel getTravelById(Integer travelId) throws Exception;
	
	/**
	 * 获取所有结伴出行记录
	 * @return
	 * @throws Exception
	 */
	public List<Travel> getAllTravels() throws Exception;
	
	/**
	 * 根据页码获取结伴出行记录
	 * @return
	 * @throws Exception
	 */
	public List<Travel> getTravelsByPage(PageBean<Travel> pageBean) throws Exception;
}
