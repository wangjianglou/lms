package com.lms.service;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lms.service.inf.IUserService;

public class PersonServiceTest {
	private BeanFactory factory = null;  
    
    @Before  
    public void before() {  
        factory = new ClassPathXmlApplicationContext("applicationContext.xml");  
    }  
      
    @Test  
    public void testSpring() {  
        IUserService userService = (IUserService) factory.getBean("userService");  
        userService.saveUser();  
        userService.getUsers();
    }  
}
