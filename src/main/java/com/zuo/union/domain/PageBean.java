package com.zuo.union.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 分页业务Bean
 * 
 * @author Administrator
 *
 */
public class PageBean<E> implements Serializable{

	private static final long serialVersionUID = -69129012365531257L;

	/* 当前页码 */
	private Integer currentPage = 1;// 默认查看“第一页”

	/* 总条数 */
	private Integer totalCount = 0;

	/* 页大小 */
	private Integer pageSize = 5;

	/* 首页（第一页） */
	private Integer firstPage = 1;

	/* 上一页索引 */
	private Integer previousPage;

	/* 下一页索引 */
	private Integer nextPage;

	/* 尾页（最后一页索引） */
	private Integer lastPage;
	
	/*起始索引*/
	private Integer beginIndex;

	/* 总页数 */
	private Integer totalPage;

	/* 当前分页的数据 */
	private List<E> list = new ArrayList<E>();
	
	public PageBean() {
	}

	public PageBean(Integer currentPage, Integer totalCount, Integer pageSize) {
		this.currentPage = currentPage;
		this.totalCount = totalCount;
		this.pageSize = pageSize;

		// 计算总页数
		this.totalPage = totalCount % pageSize == 0 ? totalCount / pageSize
				: totalCount / pageSize + 1;

		// 尾页
		lastPage = totalPage;

		// 上一页（索引）：当前页-1<1?1:当前页-1
		previousPage = currentPage - 1 < 1 ? 1 : currentPage - 1;

		// 下一页（索引）：当前页+1>尾页？尾页：当前页+1
		nextPage = currentPage + 1 > lastPage ? lastPage : currentPage + 1;
	}
	
	@Override
	public String toString() {
		return "当前第"+currentPage+"页，共"+totalPage+"页。";
	}

	public Integer getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public Integer getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getFirstPage() {
		return firstPage;
	}

	public void setFirstPage(Integer firstPage) {
		this.firstPage = firstPage;
	}

	public Integer getPreviousPage() {
		return currentPage - 1 < 1 ? 1 : currentPage - 1;
	}

	public Integer getNextPage() {
		return currentPage + 1 > lastPage ? lastPage : currentPage + 1;
	}

	public Integer getLastPage() {
		return lastPage;
	}

	public void setLastPage(Integer lastPage) {
		this.lastPage = lastPage;
	}

	public Integer getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}

	public List<E> getList() {
		return list;
	}

	public void setList(List<E> list) {
		this.list = list;
	}

	public Integer getBeginIndex() {
		return pageSize * (currentPage - 1);
	}

	public void setBeginIndex(Integer beginIndex) {
		this.beginIndex = beginIndex;
	}

}
