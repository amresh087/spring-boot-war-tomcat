package com.mkyong.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mkyong.dao.UserDao;
import com.mkyong.model.UserDetailstest;
//import com.mkyong.model.UserDetailstest;



@Component
public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public List<UserDetailstest> getUserDetailstest() {
		Criteria criteria = sessionFactory.openSession().createCriteria(UserDetailstest.class);
		return criteria.list();
	}

}
