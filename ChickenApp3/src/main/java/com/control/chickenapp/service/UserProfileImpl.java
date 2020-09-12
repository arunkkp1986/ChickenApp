package com.control.chickenapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.control.chickenapp.entity.User;
import com.control.chickenapp.repository.UserRepository;

@Service
public class UserProfileImpl implements UserProfileService{
	
	@Autowired
	private UserRepository userRepository;
	
	public User checkLogin(String mobileNo, String password) {
		
		if(mobileNo != null && !mobileNo.trim().equals("") 
				&& password != null && !password.trim().equals("")) {
			List<User> users = userRepository.findByMobileNoAndPassword(mobileNo, password);
			if(!users.isEmpty())
				return users.get(0);
		}
		
		return new User();
	}
	
	public boolean addUser(User user) {
		if(null != user) {
			User addedUser = userRepository.save(user);
			if(addedUser != null) {
				return true;
			}
		}
		return false;
	}
}
