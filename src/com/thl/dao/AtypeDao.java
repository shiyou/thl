package com.thl.dao;

import java.util.List;

import com.thl.model.Atype;

public interface AtypeDao {
	public void addAtype(Atype atype);
	public void delAtype(Long id);
	public Atype getAtype(Long id);
	public List<Atype> listAtype();
	

}
