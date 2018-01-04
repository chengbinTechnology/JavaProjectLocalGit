package source.frame.dao.base.impl;

import org.hibernate.Session;

import source.frame.dao.base.DaoException;
import source.frame.dao.base.SystemBaseException;

public class TransactionCommonDao extends AbstractCommonDao {

	@Override
	public Session openSession() throws SystemBaseException {
		try {
			return getSessionFactory().getCurrentSession();
		} catch (Exception e) {
			throw new DaoException("101", "获取数据操作层的Session异常", e);
		}
	}

	@Override
	public void closeSession(Session session) throws SystemBaseException {
		return;
	}

}
