package com.newCloud.activity.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import source.frame.dao.base.SystemBaseException;
import source.frame.dao.plus.Pagination;

import com.newCloud.activity.dao.ITestDao;
import com.newCloud.activity.service.ITestService;

@Service("testService")
public class TestService implements ITestService {
	
	@Autowired
	private ITestDao  testDao;
	
	@Override
	public List<Map> getRuData()  throws SystemBaseException{
		return testDao.getData() ;
	}
	
	@Override
	public List<Map> getRuDataByPage(Pagination pagination)  throws SystemBaseException{
		return testDao.getDataByPage(pagination);
	}

	@Override
	public Object updateProjectInfo() throws SystemBaseException {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
}
