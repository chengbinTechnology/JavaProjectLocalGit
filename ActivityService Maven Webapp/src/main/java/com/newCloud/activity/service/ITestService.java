package com.newCloud.activity.service;

import java.util.List;
import java.util.Map;

import source.frame.dao.base.SystemBaseException;
import source.frame.dao.plus.Pagination;

public interface ITestService {
	
	public List<Map> getRuData()  throws SystemBaseException;
	
	public List<Map> getRuDataByPage(Pagination pagination)  throws SystemBaseException;
	
	public Object updateProjectInfo() throws SystemBaseException;
}


