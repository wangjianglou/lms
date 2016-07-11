package com.lms.action;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.struts2.json.JSONResult;

import com.lms.bean.User;
import com.lms.dao.inf.IUserDao;
import com.lms.service.inf.IUserService;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {
	private static final long serialVersionUID = 483390372924110900L;
	
	@Resource(name="userService")
	private IUserService userService; 
	private List<User> userList = new ArrayList<User>();
	private int id;
	private String name;
	private int sex;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	/** 
     * 跳转到登录界面 
     * @return 
     */  
    public String getUsers() {
    	userList = (ArrayList<User>) userService.getUsers(); 
        return SUCCESS;  
    }  
      
    /** 
     * 登录 
     * @return 
     */  
    public String login() {  
          
        return SUCCESS;  
    }  
}
