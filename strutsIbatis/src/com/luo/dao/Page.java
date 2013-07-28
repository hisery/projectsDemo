package com.luo.dao;

public class Page {

	private int totalSize;
	private int currentPage;
	private int pageSize;
	

	public Page() {}
	public Page(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getTotalPage(){
		int i=0;
		if(totalSize%pageSize==0){
			i = totalSize/pageSize;
		}else{
			i = totalSize/pageSize+1;
		}
		return i;
	}
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		if(currentPage<1)currentPage=1;
		if(currentPage>getTotalPage())currentPage=getCurrentPage();
		this.currentPage = currentPage;
	}
	public int getTotalSize() {
		return totalSize;
	}
	public void setTotalSize(int totalSize) {
		this.totalSize = totalSize;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	/**
	 * ��ȡ��ǰҳ��ʼ����
	 * @return
	 */
	public int getStartNum(){
		int startNum = (this.currentPage - 1) * this.pageSize;
		return startNum;
	}
	/**
	 * ����:��ȡ��������
	 * ����: LuoHui
	 * ����ʱ��: 2012-12-11
	 * @return 
	 */
	public int getEndNum(){
		int startNum = getStartNum() + this.pageSize;
		return startNum;
	}
}
