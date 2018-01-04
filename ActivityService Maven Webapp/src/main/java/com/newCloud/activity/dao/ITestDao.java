package com.newCloud.activity.dao;

import java.util.List;
import java.util.Map;

import source.frame.dao.base.SystemBaseException;
import source.frame.dao.plus.Pagination;

public interface ITestDao {
    
	public List<Map> getData() throws SystemBaseException;
	
	public List<Map> getDataByPage(Pagination nation) throws SystemBaseException;
	
	public List<Map> getDataByHQLByPage(Pagination nation) throws SystemBaseException;
	
	public void saveNewObject() throws SystemBaseException;
}
