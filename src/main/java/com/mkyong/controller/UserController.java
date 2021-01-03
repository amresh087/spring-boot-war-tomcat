package com.mkyong.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mkyong.model.UserDetailstest;
import com.mkyong.service.UserService;



@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ResponseEntity<List<UserDetailstest>> UserDetailstest() {
        
		List<UserDetailstest> UserDetailstest = userService.getUserDetailstest();
		return new ResponseEntity<List<UserDetailstest>>(UserDetailstest, HttpStatus.OK);
	}

}
