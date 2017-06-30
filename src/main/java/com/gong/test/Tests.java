package com.gong.test;

import com.gong.dao.UserDao;
import com.gong.model.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.security.AllPermission;

/**
 * Created by Administrator on 2017/6/30.
 */
public class Tests {
    public static void main(String[] args){
        ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:/dao.xml");
        UserDao userDao =(UserDao) ac.getBean("userDao");
        User user1 = new User();
        user1.setId("1");
        user1.setUsername("obma");
        userDao.saveUser(user1);
        User user2 = userDao.getUser("1");
        System.out.println(user2.getUsername());
    }
}
