package com.zuo.union.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 结伴出行类
 * @author Yao
 *
 */
public class Travel implements Serializable {

	private static final long serialVersionUID = 2633970377653644270L;
	
	/*结伴出行记录id*/
	private Integer travelId;
	
	/*出行目的*/
	private String travelTitle;
	
	/*出行时间*/
	private Date travelTime;
	
	/*出行地点*/
	private String travelPlace;
	
	/*出行内容*/
	private String travelContent;
	
	/*结伴出行发布时间*/
	private Date travelPublishTime;
	
	/*发布出行的人---多对一*/
	private User user;
	
	/*本类功能模块---一对一*/
	private Functions funcition;

	public Integer getTravelId() {
		return travelId;
	}

	public void setTravelId(Integer travelId) {
		this.travelId = travelId;
	}

	public String getTravelTitle() {
		return travelTitle;
	}

	public void setTravelTitle(String travelTitle) {
		this.travelTitle = travelTitle;
	}

	public Date getTravelTime() {
		return travelTime;
	}

	public void setTravelTime(Date travelTime) {
		this.travelTime = travelTime;
	}

	public String getTravelPlace() {
		return travelPlace;
	}

	public void setTravelPlace(String travelPlace) {
		this.travelPlace = travelPlace;
	}

	public String getTravelContent() {
		return travelContent;
	}

	public void setTravelContent(String travelContent) {
		this.travelContent = travelContent;
	}

	public Date getTravelPublishTime() {
		return travelPublishTime;
	}

	public void setTravelPublishTime(Date travelPublishTime) {
		this.travelPublishTime = travelPublishTime;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Functions getFuncition() {
		return funcition;
	}

	public void setFuncition(Functions funcition) {
		this.funcition = funcition;
	}
	
}
