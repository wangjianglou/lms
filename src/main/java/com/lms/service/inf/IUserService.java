package com.lms.service.inf;

import java.util.List;

import com.lms.bean.User;

public interface IUserService {
	public void saveUser();
	public List<User> getUsers();
}
