package com.taiji.springcloud.dao;

import com.taiji.model.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao {

    public User findUserById(int id);

    public int create(User user);
}
