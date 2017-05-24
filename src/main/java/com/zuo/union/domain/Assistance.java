package com.zuo.union.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 帮帮我实体类
 * @author Administrator
 *
 */
public class Assistance implements Serializable{

	private static final long serialVersionUID = 7042406090400702692L;
	
//	帮帮我ID
	private int assiId;
//	标题
	private String assiTitle;
//	正文
	private String assiDesc;
//	发布日期
	private Date assiDate;
//	解决状态(0未解决1已解决)
	private int assiState;
	
//	发布者
	private User assiUser;
	
	public Assistance() {

	}

	public int getAssiId() {
		return assiId;
	}

	public void setAssiId(int assiId) {
		this.assiId = assiId;
	}

	public String getAssiTitle() {
		return assiTitle;
	}

	public void setAssiTitle(String assiTitle) {
		this.assiTitle = assiTitle;
	}

	public String getAssiDesc() {
		return assiDesc;
	}

	public void setAssiDesc(String assiDesc) {
		this.assiDesc = assiDesc;
	}

	public Date getAssiDate() {
		return assiDate;
	}

	public void setAssiDate(Date assiDate) {
		this.assiDate = assiDate;
	}

	public int getAssiState() {
		return assiState;
	}

	public void setAssiState(int assiState) {
		this.assiState = assiState;
	}

	public User getAssiUser() {
		return assiUser;
	}

	public void setAssiUser(User assiUser) {
		this.assiUser = assiUser;
	}

}
