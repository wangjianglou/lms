package com.lms.dao.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.lms.bean.User;
import com.lms.dao.inf.IUserDao;

@Component(value="userDao")
public class UserDao extends AbstractDataService implements IUserDao {
	@Override
	public User save(User user) {
		return (User) insert("insert", user);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> getAllUsers() {
		return (List<User>)queryForList("getUsers", null);
	}
	
	

}
