package com.thl.dao.impl;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.thl.dao.UserDao;
import com.thl.model.User;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao{

	@Override
	public void addUser(User user) {
		 getHibernateTemplate().save(user);
	}

}
