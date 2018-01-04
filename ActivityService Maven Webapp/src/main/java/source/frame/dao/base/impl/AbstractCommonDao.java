package source.frame.dao.base.impl;

import java.lang.reflect.InvocationTargetException;

import java.lang.reflect.Method;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.transform.Transformers;
import org.jboss.logging.Logger;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import source.chengbin.info.common.exception.GeneralException;
import source.frame.dao.base.DaoException;
import source.frame.dao.base.SystemBaseException;
import source.frame.dao.base.ICommonDao;
import source.frame.dao.base.SystemBaseException;
import source.frame.dao.plus.BatchUpdateObject;
import source.frame.dao.plus.Pagination;

public abstract class AbstractCommonDao extends HibernateDaoSupport implements ICommonDao {

	protected final Logger logger = Logger.getLogger(AbstractCommonDao.class);

	/**
	 * 把SQL转换为sql
	 * 
	 * @param sqlStringList
	 * @return
	 */
	public List<Query> transToQueryList(List<String> sqlStringList)
			throws SystemBaseException {
		Session session = openSession();
		try {
			List<Query> queryList = new ArrayList<Query>();
			for (int i = 0; i < sqlStringList.size(); i++) {
				SQLQuery query = session.createSQLQuery(sqlStringList.get(i));
				queryList.add(query);
			}
			return queryList;
		} catch (Exception e) {
			throw new DaoException("101", "SQL转换异常", e);
		} finally {
			this.closeSession(session);
		}
	}

	/**
	 * 保存
	 */
	@Override
	public void saveObject(Object obj) throws SystemBaseException {
		Session session = openSession();
		try {
			session.save(obj);
		} catch (Exception e) {
			throw new DaoException("101", "保存对象发生异常！", e);
		} finally {
			this.closeSession(session);
		}
	}

	/**
	 * 更新
	 */
	@Override
	public void updateObject(Object obj) throws SystemBaseException {
		Session session = openSession();
		try {
			session.update(obj);
		} catch (Exception e) {
			throw new DaoException("101", "更新对象发生异常！", e);
		} finally {
			this.closeSession(session);
		}
	}

	/**
	 * 保存或更新
	 */
	@Override
	public void saveOrUpdateObject(Object obj) throws SystemBaseException {
		Session session = openSession();
		try {
			session.saveOrUpdate(obj);
		} catch (Exception e) {
			throw new DaoException("101", "保存或者更新对象时、发生异常", e);
		} finally {
			this.closeSession(session);
		}
	}

	/**
	 * 删除
	 */
	@Override
	public void deleteObject(Object obj) throws SystemBaseException {
		Session session = openSession();
		try {
			session.delete(obj);
		} catch (Exception e) {
			throw new DaoException("101", "删除对象时发生异常！", e);
		} finally {
			this.closeSession(session);
		}
	}

	/**
	 * HQL
	 * 
	 * @param HQL
	 * @return
	 */
	@Override
	public List queryByHqlList(String HQL) throws SystemBaseException {
		Session session = openSession();
		try {
			Query query = session.createQuery(HQL);
			List list = query.list();
			return list;
		} catch (Exception e) {
			throw new DaoException("101", "执行HQL语句发生异常", e);
		} finally {
			closeSession(session);
		}
	}

	/**
	 * SQL
	 * 
	 * @param SQL
	 * @return
	 */
	@Override
	public List queryBySqlList(String SQL) throws SystemBaseException {
		Session session = openSession();
		try {
			SQLQuery query = session.createSQLQuery(SQL);
			query.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
			List list = query.list();
			return list;
		} catch (Exception e) {
			throw new DaoException("101", "执行SQL语句发生异常", e);
		} finally {
			closeSession(session);
		}
	}

	@Override
	public void executeUpdateByBatch(List<Query> queryList, Integer[] sucFlag)
			throws SystemBaseException {
		sucFlag = new Integer[queryList.size()];
		int i = 0;
		for (Query query : queryList) {
			executeUpdateByQuery(query, sucFlag[i]);
		}
	}

	@Override
	public void executeUpdateByBatch(List<Query> queryList)
			throws SystemBaseException {
		executeUpdateByBatch(queryList, null);
	}

	@Override
	public boolean executeUpdateByHQL(String HQL) throws SystemBaseException {
		return executeUpdateByHQL(HQL, null);
	}

	public void executeUpdateByQuery(Query query, Integer resultInt)
			throws SystemBaseException {
		try {
			resultInt = query.executeUpdate();
		} catch (Exception e) {
			resultInt = -1;
		}
	}

	public boolean executeUpdateByHQL(String HQL, Integer resultInt)
			throws SystemBaseException {
		Session session = openSession();
		try {
			int execuNum = -1;
			Query query = session.createQuery(HQL);
			execuNum = query.executeUpdate();
			if (resultInt != null) {
				resultInt = execuNum;
			}
			if (execuNum != -1) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			throw new DaoException("101", "批量更新发生异常", e);
		} finally {
			closeSession(session);
		}
	}

	public boolean executeUpdateBySql(String SQL) throws SystemBaseException {
		return executeUpdateBySQL(SQL, null);
	}

	@Override
	public boolean executeUpdateBySQL(String SQL, Integer resultInt)
			throws SystemBaseException {
		Session session = openSession();
		try {
			int execuNum = -1;
			SQLQuery query = session.createSQLQuery(SQL);
			execuNum = query.executeUpdate();
			if (resultInt != null) {
				resultInt = execuNum;
			}
			if (execuNum != -1) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			throw new DaoException("101", "执行SQL更新时异常", e);
		} finally {
			closeSession(session);
		}
	}

	public List queryPoListByParamAndPo(String poName, Map<String, Object> param)
			throws SystemBaseException {
		StringBuffer sb = new StringBuffer();
		String fromStr = " from " + poName + " where 1=1";
		sb.append(fromStr);
		Set<String> keySet = param.keySet();
		Iterator<String> it = keySet.iterator();
		while (it.hasNext()) {
			String fieldName = it.next();
			Object obj = param.get(fieldName);
			if (obj == null) {
				sb.append(" and " + fieldName + " is null");
			} else {
				if (obj instanceof String) {
					sb.append(" and " + fieldName + "='" + obj.toString()
							+ "' ");
				} else if (obj instanceof Date) {
					sb.append(" and " + fieldName + "='" + obj.toString()
							+ "' ");
				} else {
					sb.append(" and " + fieldName + "=" + obj.toString() + " ");
				}
			}
		}
		return this.queryByHqlList(sb.toString());
	}

	/**
	 * 获取SQL查询的总记录数
	 * 
	 * @param sqlStr
	 * @param session
	 * @return
	 */
	private int getSQLRecordCount(final String sqlStr, Session session)
			throws SystemBaseException {
		try {
			String countRecordSql = "select count(*) as count_page_record from ("
					+ sqlStr + ") as _page_count_record_template";
			SQLQuery query = session.createSQLQuery(countRecordSql);
			query.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
			Map countRecordMap = (Map) query.uniqueResult();
			return ((BigInteger) countRecordMap.get("count_page_record"))
					.intValue();
		} catch (Exception e) {
			throw new DaoException("101", "执行总记录查询异常", e);
		}
	}

	/**
	 * 获取HQL查询的总记录数
	 * 
	 * @param HQL
	 * @param session
	 * @return
	 */
	private int getHQLRecordCount(final String HQL, Session session)
			throws SystemBaseException {
		try{
		String newHQL = HQL;
		if (newHQL.startsWith("from")) {
			newHQL = "select count(*) as  count_page_record " + newHQL;
		}
		Query query = session.createQuery(newHQL);
		query.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
		Map countRecordMap = (Map) query.uniqueResult();
		return ((Long) countRecordMap.get("count_page_record")).intValue();
		}catch(Exception e){
			throw new DaoException("101","总记录数查询时异常",e);
		}
	}



	/**
	 * SQL查询，以及分页处理
	 * 
	 * @param sqlStr
	 * @param pageInfo
	 * @return
	 */
	@Override
	public List queryListBySqlByPager(final String sqlStr, Pagination pageInfo)
			throws SystemBaseException {
		Session session = openSession();
		try {
			int countRecord = getSQLRecordCount(sqlStr, session);
			SQLQuery query = session.createSQLQuery(sqlStr);
			query.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
			pageInfo.setTotalRecord(countRecord);
			query.setFirstResult(pageInfo.getFirstResult());
			query.setMaxResults(pageInfo.getMaxResult());
			return query.list();
		} catch (Exception e) {
			throw new DaoException("101", "执行SQL分页查询异常", e);
		} finally {
			this.closeSession(session);
		}
	}

	/**
	 * HQL分页查询
	 * 
	 * @param HQL
	 * @param first
	 * @param max
	 * @return
	 */
	public List queryListByHqlByPager(final String HQL, Pagination pageInfo)
			throws SystemBaseException {
		Session session = openSession();
		try {
			int count = getHQLRecordCount(HQL, session);
			Query query = session.createQuery(HQL);
			pageInfo.setTotalRecord(count);
			query.setFirstResult(pageInfo.getFirstResult());
			query.setMaxResults(pageInfo.getMaxResult());
			List list = query.list();
			return list;
		} catch (Exception e) {
			throw new DaoException("101", "执行HQL分页查询异常", e);
		} finally {
			closeSession(session);
		}
	}

}
