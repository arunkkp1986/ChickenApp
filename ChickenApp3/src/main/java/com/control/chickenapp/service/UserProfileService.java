package com.control.chickenapp.service;

import com.control.chickenapp.entity.User;

public interface UserProfileService {
	public User checkLogin(String mobileNo, String password) ;
	public boolean addUser(User user);
}
