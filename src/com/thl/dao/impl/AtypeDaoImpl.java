package com.thl.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.thl.dao.AtypeDao;
import com.thl.model.Atype;

public class AtypeDaoImpl extends HibernateDaoSupport implements AtypeDao {

	@Override
	public void addAtype(Atype atype) {
		getHibernateTemplate().save(atype);
	}

	@Override
	public void delAtype(Long id) {
		getHibernateTemplate().delete(getHibernateTemplate().get(Atype.class, id));
	}

	@Override
	public Atype getAtype(Long id) {
		return (Atype) getHibernateTemplate().get(Atype.class, id);
	}

	@Override
	public List<Atype> listAtype() {
		return getHibernateTemplate().find("from Atype");
	}

}
