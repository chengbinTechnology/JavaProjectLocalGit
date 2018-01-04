package source.frame.dao.plus;

import source.chengbin.info.common.util.JSONObjectExt;

public interface Pagination {
	/**
	 * 
	 * @return
	 */
	public int getPageSize();
	/**
	 * 
	 * @return
	 */
	public int getCurrentPage();
	public void setTotalRecord(int record);
	public void setPageSize(int num);
	public void setCurrentPage(int num);
	public int getTotalRecord();
	public int getFirstResult();
	public int getMaxResult();
	public int getTotalPage();
	public JSONObjectExt toJson();
	
}
