package com.zuo.union.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 失物招领类
 * @author Yao
 *
 */
public class LostFound implements Serializable {

	private static final long serialVersionUID = -4521321756974805543L;
	
	/*失物招领记录编号*/
	private Integer lostFoundId;
	
	/*失物招领标题*/
	private String lostFoundTitle;
	
	/*失物招领内容*/
	private String lostFoundContent;
	
	/*公告发布时间*/
	private Date lostFoundTime;
	
	/*发布公告者---多对一*/
	private User user;
	
	/*失物招领状态---一对一*/
	private LostFoundStatus lostFoundStatus;

	public Integer getLostFoundId() {
		return lostFoundId;
	}

	public void setLostFoundId(Integer lostFoundId) {
		this.lostFoundId = lostFoundId;
	}

	public String getLostFoundTitle() {
		return lostFoundTitle;
	}

	public void setLostFoundTitle(String lostFoundTitle) {
		this.lostFoundTitle = lostFoundTitle;
	}

	public String getLostFoundContent() {
		return lostFoundContent;
	}

	public void setLostFoundContent(String lostFoundContent) {
		this.lostFoundContent = lostFoundContent;
	}

	public Date getLostFoundTime() {
		return lostFoundTime;
	}

	public void setLostFoundTime(Date lostFoundTime) {
		this.lostFoundTime = lostFoundTime;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public LostFoundStatus getLostFoundStatus() {
		return lostFoundStatus;
	}

	public void setLostFoundStatus(LostFoundStatus lostFoundStatus) {
		this.lostFoundStatus = lostFoundStatus;
	}
	
	
}
