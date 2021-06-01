package com.taiji.springcloud.service.impl;

import com.taiji.springcloud.dao.UserDao;
import com.taiji.model.User;
import com.taiji.springcloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public int create(User user) {
        int i = userDao.create(user);
        return i;
    }

    @Override
    public User findUserById(int id) {
        User user = userDao.findUserById(id);
        return user;
    }
}
