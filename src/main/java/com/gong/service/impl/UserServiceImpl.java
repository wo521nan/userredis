package com.gong.service.impl;

import com.gong.dao.UserDao;
import com.gong.model.User;
import com.gong.service.UserService;

import java.util.List;

/**
 * Created by Administrator on 2017/6/29.
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void saveUser(User user) {
        userDao.saveUser(user);
    }

    public User getUser(String id) {
        return userDao.getUser(id);
    }
//    public boolean add(User user) {
//        return userDao.add(user);
//    }
//
//    public void delete(List<String> keys) {
//        userDao.delete(keys);
//    }
//
//    public boolean update(User user) {
//        return userDao.update(user);
//    }
//
//    public User get(String keyId) {
//        return userDao.get(keyId);
//    }
}
