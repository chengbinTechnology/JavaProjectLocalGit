package source.frame.dao.base.impl;

import org.hibernate.Session;

import source.frame.dao.base.DaoException;
import source.frame.dao.base.SystemBaseException;

public class ImmediaCommonDao extends AbstractCommonDao {

	@Override
	public Session openSession() throws SystemBaseException {
		try {
			return getSessionFactory().openSession();
		} catch (Exception e) {
			throw new DaoException("101", "获取数据操作层的Session异常", e);
		}
	}

	
	
	@Override
	public void closeSession(Session session) throws SystemBaseException {
		try {
			session.flush();
			session.close();
		} catch (Exception e) {
			throw new DaoException("101", "关闭Session发生异常", e);
		}
	}

}
