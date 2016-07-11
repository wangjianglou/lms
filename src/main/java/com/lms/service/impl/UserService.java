package com.lms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.lms.bean.User;
import com.lms.dao.inf.IUserDao;
import com.lms.service.inf.IUserService;

@Component(value="userService")
public class UserService extends AbstractService implements IUserService {
	@Resource(name="userDao")
	private IUserDao userDao;  
    

/*	public IUserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(IUserDao userDao) {
		this.userDao = userDao;
	}*/

	@Override
	public void saveUser() {
		User user = new User();
		user.setName("song");
		user.setId(29);
		user.setSex(1);
		userDao.save(user);
		log.info("����"+user+"�ɹ���");
	}

	@Override
	public List<User> getUsers() {
		List<User> list = userDao.getAllUsers();
		log.info("��ȡ�û��б�:"+list);
		return list;
	}  

}
