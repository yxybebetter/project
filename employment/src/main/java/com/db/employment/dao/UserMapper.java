package com.db.employment.dao;

import com.db.employment.pojo.User;
import com.db.employment.pojo.UserParam;

public interface UserMapper {
    User getUser(UserParam user);
    int insertUser(User user);
}
