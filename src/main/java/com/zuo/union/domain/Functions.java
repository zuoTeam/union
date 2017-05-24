package com.zuo.union.domain;

import java.io.Serializable;

/**
 * 功能模块类
 * @author Yao
 *
 */
public class Functions implements Serializable{
	
	private static final long serialVersionUID = -244980039916459401L;

	/*功能模块id*/
	private Integer funcId;
	
	/*功能模块名称*/
	private String funcName;

	public Integer getFuncId() {
		return funcId;
	}

	public void setFuncId(Integer funcId) {
		this.funcId = funcId;
	}

	public String getFuncName() {
		return funcName;
	}

	public void setFuncName(String funcName) {
		this.funcName = funcName;
	}
	
	
}
