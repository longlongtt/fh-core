package com.fh.zl.util;


public class PageUtil{

	private Integer	pageNow	= 1;

	private Integer	pageSize	= 5;

	private Integer	startIndex;

	private Integer	endIndex;

	private Integer	totalCount;

	private Integer	pageNum;
	
	public void calculate() {
		// 开始下标
		this.startIndex = (pageNow - 1) * pageSize;

		this.endIndex = pageNow * pageSize;

		this.pageNum = totalCount % pageSize == 0 ? (totalCount / pageSize) : (totalCount / pageSize + 1);
	}

	public Integer getPageNow() {
		return pageNow;
	}

	public void setPageNow(Integer pageNow) {
		this.pageNow = pageNow;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getStartIndex() {
		return startIndex;
	}

	public void setStartIndex(Integer startIndex) {
		this.startIndex = startIndex;
	}

	public Integer getEndIndex() {
		return endIndex;
	}

	public void setEndIndex(Integer endIndex) {
		this.endIndex = endIndex;
	}

	public Integer getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getPageNum() {
		return pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}


}
