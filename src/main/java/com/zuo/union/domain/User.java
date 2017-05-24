package com.zuo.union.domain;

import java.io.Serializable;
import java.util.Date;
/**
 * 用户类
 * @author wang
 *
 */
public class User implements Serializable{
	/**
	 * 序列化User类
	 */
	private static final long serialVersionUID = -1382418732730590680L;

	/*用户id*/
	private Long userId;
	/*用户账号*/
	private String userName;
	/*用户密码*/
	private String userPass;
	/*用户昵称*/
	private String userNickname;
	/*用户电话*/
	private String userTel;
	/*用户邮箱*/
	private String userEmail;
	/*用户所在小区或社区*/
	private String userCommunity;
	/*用户注册时间*/
	private Date userDate;
	/*类型id,关联types类：many-to-one,用于区分用户的身份*/
	private Long typeId;
	
	
	public Long getUser_Id() {
		return userId;
	}
	public void setUser_Id(Long userId) {
		this.userId = userId;
	}
	public String getUser_Name() {
		return userName;
	}
	public void setUser_Name(String userName) {
		this.userName = userName;
	}
	public String getUser_Pass() {
		return userPass;
	}
	public void setUser_Pass(String userPass) {
		this.userPass = userPass;
	}
	public String getUser_Nickname() {
		return userNickname;
	}
	public void setUser_Nickname(String userNickname) {
		this.userNickname = userNickname;
	}
	public String getUser_Tel() {
		return userTel;
	}
	public void setUser_Tel(String userTel) {
		this.userTel = userTel;
	}
	public String getUser_Email() {
		return userEmail;
	}
	public void setUser_Email(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUser_Community() {
		return userCommunity;
	}
	public void setUser_Community(String userCommunity) {
		this.userCommunity = userCommunity;
	}
	public Date getUser_Date() {
		return userDate;
	}
	public void setUser_Date(Date userDate) {
		this.userDate = userDate;
	}
	public Long getType_Id() {
		return typeId;
	}
	public void setType_Id(Long typeId) {
		this.typeId = typeId;
	}
	
	
}
