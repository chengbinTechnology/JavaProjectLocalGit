package com.newCloud.activity.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import source.frame.dao.base.ServiceException;
import source.frame.dao.base.SystemBaseException;
import source.frame.dao.plus.Pagination;

import com.newCloud.activity.dao.ITestDao;
import com.newCloud.activity.service.ITestService;

@Service("testHqlService")
public class HQLTestService implements ITestService {

	@Autowired
	private ITestDao  testDao;

	
	@Override
	public List<Map> getRuData() throws SystemBaseException{
		return testDao.getData();
	}
	
	
	public Object updateProjectInfo() throws SystemBaseException{
		  int donet=-1;
		  	testDao.saveNewObject();
	      if(donet>0){
	    	  testDao.saveNewObject();
	    	   return "success";
	      }else{
	    	  throw new ServiceException("10101","业务错误测试");
	      }
	}

	@Override
	public List<Map> getRuDataByPage(Pagination pagination) throws SystemBaseException {
		return testDao.getDataByHQLByPage(pagination);
	}

	
	
}
