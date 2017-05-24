package com.zuo.union.domain;

import java.io.Serializable;

/**
 * 图片实体类
 * @author Hydra
 *
 */
public class Image implements Serializable{

	private static final long serialVersionUID = -6901815207819562077L;
	
//	图片ID
	private int imageId;
//	图片路径
	private String imagePath;
//	图片对应的功能模块
	private	Functions func;
//	图片对应的条目
	private Object object;
	
	public Image() {

	}

	public int getImageId() {
		return imageId;
	}

	public void setImageId(int imageId) {
		this.imageId = imageId;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public Functions getFunc() {
		return func;
	}

	public void setFunc(Functions func) {
		this.func = func;
	}

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}
	
}
