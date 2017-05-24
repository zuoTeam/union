package com.zuo.union.domain;

import java.io.Serializable;

/**
 * 站内信实体类
 * @author Hydra
 *
 */
public class Letter implements Serializable{

	private static final long serialVersionUID = -3118856719942948816L;
	
//	站内信ID
	private int letterId;
//	站内信标题
	private String letterTitle;
//	站内信内容
	private String letterDesc;
//	发送者
	private User publisher;
//	接收者
	private User recipient;
//	来自某个功能模块
	private Functions func;
	
	public Letter() {

	}

	public int getLetterId() {
		return letterId;
	}

	public void setLetterId(int letterId) {
		this.letterId = letterId;
	}

	public String getLetterTitle() {
		return letterTitle;
	}

	public void setLetterTitle(String letterTitle) {
		this.letterTitle = letterTitle;
	}

	public String getLetterDesc() {
		return letterDesc;
	}

	public void setLetterDesc(String letterDesc) {
		this.letterDesc = letterDesc;
	}

	public User getPublisher() {
		return publisher;
	}

	public void setPublisher(User publisher) {
		this.publisher = publisher;
	}

	public User getRecipient() {
		return recipient;
	}

	public void setRecipient(User recipient) {
		this.recipient = recipient;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Functions getFunc() {
		return func;
	}

	public void setFunc(Functions func) {
		this.func = func;
	}
	
}
