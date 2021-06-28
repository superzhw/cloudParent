package com.taiji.cloudnacos.service;

import com.taiji.model.User;

public interface UserService {
    public int create(User user);

    public User findUserById(int id);
}
