package com.db.employment.service;

import com.db.employment.dao.UserMapper;
import com.db.employment.pojo.User;
import com.db.employment.pojo.UserParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    public User getUser(UserParam user){
        return userMapper.getUser(user);
    }

    public int insertUser(User user){
        return userMapper.insertUser(user);
    }
}
