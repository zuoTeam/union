package com.zuo.union.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 物业公告类
 * @author Yao
 *
 */
public class Notice implements Serializable {

	private static final long serialVersionUID = -7715678210354654704L;
	
	/*公告id */
	private Integer noticeId;
	
	/*公告标题*/
	private String noticeTitle;
	
	/*公告内容*/
	private String noticeContent;
	
	/*公告发布时间*/
	private Date noticeTime;
	
	/*发布公告者*/
	private User user;

	public Integer getNoticeId() {
		return noticeId;
	}

	public void setNoticeId(Integer noticeId) {
		this.noticeId = noticeId;
	}

	public String getNoticeTitle() {
		return noticeTitle;
	}

	public void setNoticeTitle(String noticeTitle) {
		this.noticeTitle = noticeTitle;
	}

	public String getNoticeContent() {
		return noticeContent;
	}

	public void setNoticeContent(String noticeContent) {
		this.noticeContent = noticeContent;
	}

	public Date getNoticeTime() {
		return noticeTime;
	}

	public void setNoticeTime(Date noticeTime) {
		this.noticeTime = noticeTime;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
}
