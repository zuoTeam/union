package com.zuo.union.domain;

import java.io.Serializable;

/**
 * 积分商品实体类
 * @author Hydra
 *
 */
public class PointGoods implements Serializable{

	private static final long serialVersionUID = 3907336881359809474L;
	
//	积分商品ID
	private int pGoodsId;
//	商品名
	private String pGoodsName;
//	商品描述
	private String pGoodsDesc;
//	商品单价
	private Double pGoodsPrice;
//	商品库存
	private	int pGoodsCount;
	
	public PointGoods() {

	}

	public int getpGoodsId() {
		return pGoodsId;
	}

	public void setpGoodsId(int pGoodsId) {
		this.pGoodsId = pGoodsId;
	}

	public String getpGoodsName() {
		return pGoodsName;
	}

	public void setpGoodsName(String pGoodsName) {
		this.pGoodsName = pGoodsName;
	}

	public String getpGoodsDesc() {
		return pGoodsDesc;
	}

	public void setpGoodsDesc(String pGoodsDesc) {
		this.pGoodsDesc = pGoodsDesc;
	}

	public Double getpGoodsPrice() {
		return pGoodsPrice;
	}

	public void setpGoodsPrice(Double pGoodsPrice) {
		this.pGoodsPrice = pGoodsPrice;
	}

	public int getpGoodsCount() {
		return pGoodsCount;
	}

	public void setpGoodsCount(int pGoodsCount) {
		this.pGoodsCount = pGoodsCount;
	}
	
}
