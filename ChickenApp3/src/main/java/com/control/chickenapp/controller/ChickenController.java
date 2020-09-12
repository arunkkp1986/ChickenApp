package com.control.chickenapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.control.chickenapp.service.UserProfileService;

@RestController
public class ChickenController {

	@Autowired
	private UserProfileService userProfileService;
	@RequestMapping("/getChicken")
	public String getChicken() {
		return "10 KG";
	}
	
	
	@RequestMapping("/login")
	public String login(@RequestParam("mobileNo") String mobileNo, @RequestParam("password") String password) {
//		boolean isAvailable = false;
//		if(mobileNo != null && !mobileNo.trim().equals("") 
//				&& password != null && !password.trim().equals("")) {
//			isAvailable = RetrieveController.checkLogin(mobileNo, password);
//			if(isAvailable) {
//				return mobileNo + " Welcome to Chicken Wolrd!!!!";
//			}else {
//				return mobileNo + " Sorry you have not registered!!!!";
//			}
//		}else {
//			return mobileNo + " Sorry you have not registered!!!!";
//		}

		
		return null;
	}
	
	@RequestMapping("/retrieve")
	public String returnData(@RequestParam("mobileNo") String mobileNo, @RequestParam("password") String password) {
		return null;
	}
	
}
