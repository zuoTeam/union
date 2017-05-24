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
	private Long user_Id;
	/*用户账号*/
	private String user_Name;
	/*用户密码*/
	private String user_Pass;
	/*用户昵称*/
	private String user_Nickname;
	/*用户电话*/
	private String user_Tel;
	/*用户邮箱*/
	private String user_Email;
	/*用户所在小区或社区*/
	private String user_Community;
	/*用户注册时间*/
	private Date user_Date;
	/*类型id,关联types类：many-to-one,用于区分用户的身份*/
	private Long type_Id;
	
	
	public Long getUser_Id() {
		return user_Id;
	}
	public void setUser_Id(Long user_Id) {
		this.user_Id = user_Id;
	}
	public String getUser_Name() {
		return user_Name;
	}
	public void setUser_Name(String user_Name) {
		this.user_Name = user_Name;
	}
	public String getUser_Pass() {
		return user_Pass;
	}
	public void setUser_Pass(String user_Pass) {
		this.user_Pass = user_Pass;
	}
	public String getUser_Nickname() {
		return user_Nickname;
	}
	public void setUser_Nickname(String user_Nickname) {
		this.user_Nickname = user_Nickname;
	}
	public String getUser_Tel() {
		return user_Tel;
	}
	public void setUser_Tel(String user_Tel) {
		this.user_Tel = user_Tel;
	}
	public String getUser_Email() {
		return user_Email;
	}
	public void setUser_Email(String user_Email) {
		this.user_Email = user_Email;
	}
	public String getUser_Community() {
		return user_Community;
	}
	public void setUser_Community(String user_Community) {
		this.user_Community = user_Community;
	}
	public Date getUser_Date() {
		return user_Date;
	}
	public void setUser_Date(Date user_Date) {
		this.user_Date = user_Date;
	}
	public Long getType_Id() {
		return type_Id;
	}
	public void setType_Id(Long type_Id) {
		this.type_Id = type_Id;
	}
	
	
}
