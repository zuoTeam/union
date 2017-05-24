package com.zuo.union.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 社区活动类
 * @author Yao
 *
 */
public class Activity implements Serializable{
	
	private static final long serialVersionUID = -5150182670113430894L;

	/*社区活动id*/
	private Integer actId;
	
	/*活动主题*/
	private String actTitle;
	
	/*社区活动地点*/
	private String actPlace;
	
	/*社区活动时间*/
	private Date actTime;
	
	/*社区活动内容*/
	private String actContent;
	
	/*社区活动发布时间*/
	private Date actPublishTime;
	
	/*社区活动参与人数*/
	private Integer actPeople;
	
	/*发布社区活动的人---多对一*/
	private User user;
	
	/*本类功能模块---一对一*/
	private Functions funcition;

	public Integer getActId() {
		return actId;
	}

	public void setActId(Integer actId) {
		this.actId = actId;
	}

	public String getActTitle() {
		return actTitle;
	}

	public void setActTitle(String actTitle) {
		this.actTitle = actTitle;
	}

	public String getActPlace() {
		return actPlace;
	}

	public void setActPlace(String actPlace) {
		this.actPlace = actPlace;
	}

	public Date getActTime() {
		return actTime;
	}

	public void setActTime(Date actTime) {
		this.actTime = actTime;
	}

	public String getActContent() {
		return actContent;
	}

	public void setActContent(String actContent) {
		this.actContent = actContent;
	}

	public Date getActPublishTime() {
		return actPublishTime;
	}

	public void setActPublishTime(Date actPublishTime) {
		this.actPublishTime = actPublishTime;
	}

	public Integer getActPeople() {
		return actPeople;
	}

	public void setActPeople(Integer actPeople) {
		this.actPeople = actPeople;
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
