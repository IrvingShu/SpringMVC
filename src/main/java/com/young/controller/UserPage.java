package com.young.controller;

public class UserPage {
	private Integer startRow=0;//��ʼλ��
	private Integer endRow=5;//����λ��
	private Integer pageNo=0;//�ڼ�ҳ
	
	
	public Integer getPageNo() {
		return pageNo;
	}
	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}
	public Integer getStartRow() {
		return startRow;
	}
	public void setStartRow(Integer startRow) {
		this.startRow = startRow;
	}
	public Integer getEndRow() {
		return endRow;
	}
	public void setEndRow(Integer endRow) {
		this.endRow = endRow;
	}
	
	
}