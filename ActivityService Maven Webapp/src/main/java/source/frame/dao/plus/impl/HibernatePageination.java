package source.frame.dao.plus.impl;

import source.chengbin.info.common.util.JSONObjectExt;
import source.frame.dao.plus.Pagination;

public class HibernatePageination implements Pagination {

	private final int PAGESIZE=20;
	
	
	private int pageSize;
	private int currentPage;
	private int totalRecord=0;
	
	
	public HibernatePageination(int pageSize,int currentPage){
		this.pageSize=pageSize;
		if(currentPage==0){
			this.currentPage=1;
		}else{
		    this.currentPage=currentPage;
		}
	}
	
	public HibernatePageination(String currentPage) throws Exception{
	    this("20",currentPage);
	}
	
	
	
	
	public HibernatePageination(String pageSize,String currentPage) throws Exception{
		if(pageSize==null){
			this.pageSize=10;
		}else{
			this.pageSize=Integer.valueOf(pageSize);
		}
		if(currentPage==null){
			this.currentPage=1;
		}else{
			this.currentPage=Integer.valueOf(currentPage);
		}
	}
	
	
	
	
	public HibernatePageination(){
		this.pageSize=PAGESIZE;
		this.currentPage=1;
	}
	
	
	
	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getTotalRecord() {
		return totalRecord;
	}

	public void setTotalRecord(int totalRecord) {
		this.totalRecord = totalRecord;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getFirstResult() {
		return (currentPage-1)*pageSize;
	}
	
	public int getMaxResult() {
		return pageSize;
	}
	
	
	public int getTotalPage(){
		if(totalRecord>0){
			if((totalRecord % pageSize)==0){
				return totalRecord/pageSize;
			}else{
				return totalRecord/pageSize+1;
			}
		}else{
			return 1;
		}
	}
	
	
	public JSONObjectExt toJson(){
		JSONObjectExt jsonObject=new JSONObjectExt();
		jsonObject.put("page", this.getCurrentPage()).put("records", this.getPageSize()).put("total", this.getTotalRecord());
	    return jsonObject;
	}
	
	

}
