package com.thl.service.impl;

import java.util.List;

import com.thl.dao.AtypeDao;
import com.thl.model.Atype;
import com.thl.service.AtypeService;

public class AtypeServiceImpl implements AtypeService {
	AtypeDao atypeDao ;

	public AtypeDao getAtypeDao() {
		return atypeDao;
	}

	public void setAtypeDao(AtypeDao atypeDao) {
		this.atypeDao = atypeDao;
	}

	@Override
	public void addAtype(Atype atype) {
		atypeDao.addAtype(atype);
	}

	@Override
	public void delAtype(Long id) {
		atypeDao.delAtype(id);
	}

	@Override
	public Atype getAtype(Long id) {
		return atypeDao.getAtype(id);
	}

	@Override
	public List<Atype> listAtype() {
		return atypeDao.listAtype();
	}

}
