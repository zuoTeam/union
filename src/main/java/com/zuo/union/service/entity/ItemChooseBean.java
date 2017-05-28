package com.zuo.union.service.entity;

import java.io.Serializable;

/**
 * 每个功能分区下的条目选择实体类
 * @author Yao
 *
 */
public class ItemChooseBean implements Serializable{

	private static final long serialVersionUID = 7968543387597897863L;
	
	/* 当前条目处于第几条*/
	private Integer currentItemCount;

	/* 总条目数 */
	private Integer totalCount;

	/* 第一条信息 */
	private Integer firstItem = 0;

	/* 上一条信息 */
	private Integer previousItem;

	/* 下一条信息 */
	private Integer nextItem;

	/*最后一条信息*/
	private Integer lastItem;

	public ItemChooseBean() {
	}
	
	public ItemChooseBean(Integer currentItemCount, Integer totalCount) {
		this.currentItemCount = currentItemCount;
		this.totalCount = totalCount;

		// 最后一条记录(索引=总数-1)
		lastItem = totalCount-1;

		// 上一条记录：当前记录数-1<0?0:当前记录数-1
		previousItem = currentItemCount - 1 < 0 ? 0 : currentItemCount - 1;

		// 下一条记录：当前记录数+1>最后一条记录数？最后一条记录数：当前记录数+1
		nextItem = currentItemCount + 1 > lastItem ? lastItem : currentItemCount + 1;
	}
	
	public Integer getCurrentItemCount() {
		return currentItemCount;
	}

	public void setCurrentItemCount(Integer currentItemCount) {
		this.currentItemCount = currentItemCount;
	}

	public Integer getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getFirstItem() {
		return firstItem;
	}

	public void setFirstItem(Integer firstItem) {
		this.firstItem = firstItem;
	}

	public Integer getPreviousItem() {
		return previousItem;
	}

	public void setPreviousItem() {
		this.previousItem = currentItemCount - 1 < 0 ? 0 : currentItemCount - 1;
	}

	public Integer getNextItem() {
		return nextItem;
	}
	
	public Integer getLastItem() {
		return lastItem;
	}

	public void setLastItem(Integer lastItem) {
		this.lastItem = lastItem;
	}

	public void setNextItem() {
		this.nextItem = currentItemCount + 1 > lastItem ? lastItem : currentItemCount + 1;
	}
}
