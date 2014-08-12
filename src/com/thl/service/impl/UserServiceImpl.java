package com.thl.service.impl;

import com.thl.dao.UserDao;
import com.thl.model.User;
import com.thl.service.UserService;

public class UserServiceImpl implements UserService{
	
	UserDao userDAO;


	public UserDao getUserDAO() {
		return userDAO;
	}


	public void setUserDAO(UserDao userDAO) {
		this.userDAO = userDAO;
	}


	@Override
	public void addUser(User user) {
		userDAO.addUser(user);
		
	}


	@Override
	public User getUser(Long id) {
		return userDAO.getUser(id);
	}

}
