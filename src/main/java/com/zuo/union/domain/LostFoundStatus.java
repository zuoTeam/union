package com.zuo.union.domain;

import java.io.Serializable;

/**
 * 失物招领状态类
 * @author Yao
 *
 */
public class LostFoundStatus implements Serializable {

	private static final long serialVersionUID = 8473057779780703232L;
	
	/*失物招领状态id*/
	private Integer lostFoundStatusId;//0：无人认领 ,1：已认领
	
	/*失物招领状态*/
	private String lostFoundStatus;

	public Integer getLostFoundStatusId() {
		return lostFoundStatusId;
	}

	public void setLostFoundStatusId(Integer lostFoundStatusId) {
		this.lostFoundStatusId = lostFoundStatusId;
	}

	public String getLostFoundStatus() {
		return lostFoundStatus;
	}

	public void setLostFoundStatus(String lostFoundStatus) {
		this.lostFoundStatus = lostFoundStatus;
	}
	
	
	
}
