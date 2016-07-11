package com.lms.dao.inf;

import java.util.List;

import com.lms.bean.User;

public interface IUserDao {
	public User save(User user);
	public List<User> getAllUsers();
}
