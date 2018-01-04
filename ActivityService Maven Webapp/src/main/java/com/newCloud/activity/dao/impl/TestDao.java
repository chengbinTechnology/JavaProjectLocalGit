package com.newCloud.activity.dao.impl;

import java.util.List;
import java.util.Map;

import org.dom4j.IllegalAddException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.newCloud.activity.dao.ITestDao;
import com.newCloud.activity.po.ActRuTask;
import com.newCloud.activity.po.ActTestTable;

import source.frame.dao.base.DaoException;
import source.frame.dao.base.SystemBaseException;
import source.frame.dao.base.impl.AbstractCommonDao;
import source.frame.dao.base.impl.TransactionCommonDao;
import source.frame.dao.plus.Pagination;


@Repository("testDao")
public class TestDao extends TransactionCommonDao implements ITestDao{

	@Override
	public List<Map> getData() throws SystemBaseException {
		return this.queryBySqlList("select * from act_ru_task");
	}
	
	public void saveNewObject() throws SystemBaseException{
		ActTestTable task=new ActTestTable();
		task.setName("chengbin");
		task.setSex("nv");
		this.saveOrUpdateObject(task);
	}
	
	
	
	@Override
	public List<Map> getDataByPage(Pagination nation) throws SystemBaseException{
		throw new DaoException("102","抛出异常",new IllegalAddException("不安全的调用"));
		//return this.queryListBySqlByPager("select * from act_ru_task", nation);
	}

	@Override
	public List<Map> getDataByHQLByPage(Pagination nation) throws SystemBaseException {
		return this.queryListByHqlByPager("from ActRuTask ", nation);
	}
 
	
	
	
	
	
}
