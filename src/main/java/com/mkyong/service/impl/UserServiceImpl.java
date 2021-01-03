/**
 * 
 */
package com.mkyong.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mkyong.dao.UserDao;
import com.mkyong.model.UserDetailstest;
import com.mkyong.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;

	public List<UserDetailstest> getUserDetailstest() {
		return userDao.getUserDetailstest();

	}

}
