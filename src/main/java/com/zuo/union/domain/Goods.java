package com.zuo.union.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 商品类
 * @author wang
 *
 */
public class Goods implements Serializable{

	/**
	 * 序列化物品类
	 */
	private static final long serialVersionUID = 6730866031574481606L;

	/*物品id*/
	private Long goods_Id;
	/*物品名称*/
	private String goods_Name;
	/*物品描述*/
	private String goods_Describe;
	/*物品价格*/
	private Double goods_price;
	/*物品数量*/
	private Long goods_Count;
	/*物品上架时间*/
	private Date goods_Date;
	/*类型id,many-to-one,关联*/
	private Long type_Id;
	/*物品所有者id*/
	private Long user_Id;
	public Long getGoods_Id() {
		return goods_Id;
	}
	public void setGoods_Id(Long goods_Id) {
		this.goods_Id = goods_Id;
	}
	public String getGoods_Name() {
		return goods_Name;
	}
	public void setGoods_Name(String goods_Name) {
		this.goods_Name = goods_Name;
	}
	public String getGoods_Describe() {
		return goods_Describe;
	}
	public void setGoods_Describe(String goods_Describe) {
		this.goods_Describe = goods_Describe;
	}
	public Double getGoods_price() {
		return goods_price;
	}
	public void setGoods_price(Double goods_price) {
		this.goods_price = goods_price;
	}
	public Long getGoods_Count() {
		return goods_Count;
	}
	public void setGoods_Count(Long goods_Count) {
		this.goods_Count = goods_Count;
	}
	public Date getGoods_Date() {
		return goods_Date;
	}
	public void setGoods_Date(Date goods_Date) {
		this.goods_Date = goods_Date;
	}
	public Long getType_Id() {
		return type_Id;
	}
	public void setType_Id(Long type_Id) {
		this.type_Id = type_Id;
	}
	public Long getUser_Id() {
		return user_Id;
	}
	public void setUser_Id(Long user_Id) {
		this.user_Id = user_Id;
	}

	
}
