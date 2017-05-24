package com.zuo.union.domain;

import java.io.Serializable;
/**
 * 帖子类
 * @author wang
 *
 */
import java.util.Date;
public class Forum implements Serializable{

	private static final long serialVersionUID = 3322100813968365102L;
	/*帖子id*/
	private Long forumId;
	/*帖子标题*/
	private String forumName;
	/*帖子内容*/
	private String forumContent;
	/*发帖时间*/
	private Date forumDate;
	/*发帖人id,关联User类*/
	private Long userId;
	/*帖子类型,关联types类*/
	private Long typeId;
	public Long getForumId() {
		return forumId;
	}
	public void setForumId(Long forumId) {
		this.forumId = forumId;
	}
	public String getForumName() {
		return forumName;
	}
	public void setForumName(String forumName) {
		this.forumName = forumName;
	}
	public String getForumContent() {
		return forumContent;
	}
	public void setForumContent(String forumContent) {
		this.forumContent = forumContent;
	}
	public Date getForumDate() {
		return forumDate;
	}
	public void setForumDate(Date forumDate) {
		this.forumDate = forumDate;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getTypeId() {
		return typeId;
	}
	public void setTypeId(Long typeId) {
		this.typeId = typeId;
	}
	
	
}
