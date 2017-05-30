package com.zuo.union.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.zuo.union.domain.PageBean;
import com.zuo.union.domain.Travel;

/**
 * 结伴出行持久层
 * @author Yao
 *
 */
@Repository("travelMapper")
public interface TravelMapper {
	
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
	
	/**
	 * 用户结伴出行
	 * @param attendTravelMap
	 * @return
	 * @throws Exception
	 */
	public int toBePartner(Map<String, Object> attendTravelMap) throws Exception;
	
	/**
	 * 查询用户是否参与某项出行
	 * @param attendTravelMap
	 * @return
	 * @throws Exception
	 */
	public int checkIsAttend(Map<String, Object> attendTravelMap) throws Exception;
	
	/**
	 * 用户发布结伴出行
	 * @param travel
	 * @throws Exception
	 */
	public int issueTravel(Travel travel) throws Exception;

}
