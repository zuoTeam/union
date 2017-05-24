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
	/*用户积分*/
	private int userPoint;
	/*类型id,关联types类：many-to-one,用于区分用户的身份*/
	private Long typeId;
	
	
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPass() {
		return userPass;
	}
	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}
	public String getUserNickname() {
		return userNickname;
	}
	public void setUserNickname(String userNickname) {
		this.userNickname = userNickname;
	}
	public String getUserTel() {
		return userTel;
	}
	public void setUserTel(String userTel) {
		this.userTel = userTel;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserCommunity() {
		return userCommunity;
	}
	public void setUserCommunity(String userCommunity) {
		this.userCommunity = userCommunity;
	}
	public Date getUserDate() {
		return userDate;
	}
	public void setUserDate(Date userDate) {
		this.userDate = userDate;
	}
	public Long getTypeId() {
		return typeId;
	}
	public void setTypeId(Long typeId) {
		this.typeId = typeId;
	}
	public int getUserPoint() {
		return userPoint;
	}
	public void setUserPoint(int userPoint) {
		this.userPoint = userPoint;
	}
	
	
}
