package com.zuo.union.domain;

import java.io.Serializable;

/**
 * 评论类
 * @author Yao
 *
 */
public class Comment<E> implements Serializable {

	private static final long serialVersionUID = 1840904312726534077L;
	
	/*评论条目id*/
	private Integer commentId;
	
	/*评论内容*/
	private String commentContent;
	
	/*该类所属功能模块*/
	private Functions function;
	
	/*评论的类别（类是变化的，统一定义成父类Object）*/
	/*private Object object;*/
	private E e;
	
	/*发布评论的用户*/
	private User user;

	public Integer getCommentId() {
		return commentId;
	}

	public void setCommentId(Integer commentId) {
		this.commentId = commentId;
	}

	public String getCommentContent() {
		return commentContent;
	}

	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}

	public Functions getFunction() {
		return function;
	}

	public void setFunction(Functions function) {
		this.function = function;
	}

	/*public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}*/

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public E getE() {
		return e;
	}

	public void setE(E e) {
		this.e = e;
	}
	
	
}
