package com.thl.service;

import java.util.List;

import com.thl.model.Atype;

public interface AtypeService {
	void addAtype(Atype atype);
	void delAtype(Long id);
	Atype getAtype(Long id);
	List<Atype> listAtype();

}
