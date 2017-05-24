package com.zuo.union.domain;

import java.io.Serializable;

/**
 * 类型实体类，糅合所有的类别
 * @author Hydra
 *
 */
public class Type implements Serializable{

	private static final long serialVersionUID = -3426609834367528046L;
	
//	类别ID
	private int typeId;
//	类别名
	private String typeName;
	
	public Type() {

	}

	public int getTypeId() {
		return typeId;
	}

	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

}
