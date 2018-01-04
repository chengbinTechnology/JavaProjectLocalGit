package source.frame.dao.base;

import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.Session;

import source.chengbin.info.common.exception.GeneralException;
import source.frame.dao.plus.BatchUpdateObject;
import source.frame.dao.plus.Pagination;

public interface ICommonDao {
	public Session openSession() throws SystemBaseException;
	public void closeSession(Session session) throws SystemBaseException;
	public void saveObject(Object obj) throws SystemBaseException;
	public void updateObject(Object obj) throws SystemBaseException;
	public void saveOrUpdateObject(Object obj) throws SystemBaseException;
	public void deleteObject(Object obj) throws SystemBaseException;
	public List queryByHqlList(String HQL) throws SystemBaseException;
	public List queryBySqlList(String SQL) throws SystemBaseException;
	public List queryListByHqlByPager(final String HQL, Pagination pageInfo) throws SystemBaseException;
	public List queryListBySqlByPager(final String sqlStr, Pagination pageInfo) throws SystemBaseException;
	public boolean executeUpdateByHQL(String HQL ) throws SystemBaseException;
	public void executeUpdateByBatch(List<Query> queryList,Integer[] sucFlag) throws SystemBaseException;
	public boolean executeUpdateByHQL(String HQL,Integer resultInt) throws SystemBaseException;
	public boolean executeUpdateBySql(String SQL) throws SystemBaseException;
	public boolean executeUpdateBySQL(String SQL, Integer resultInt) throws SystemBaseException;
	public void executeUpdateByBatch(List<Query> queryList) throws SystemBaseException;
}
