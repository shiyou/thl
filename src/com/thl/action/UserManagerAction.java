package com.thl.action;

import com.opensymphony.xwork2.ModelDriven;
import com.thl.model.User;
import com.thl.service.UserService;

public class UserManagerAction implements ModelDriven<User>{
	private User user = new User();
	private UserService userService;
	@Override
	public User getModel() {
		return user;
	}
	
	public String addUser(){
		userService.addUser(user);
		return "success";
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
