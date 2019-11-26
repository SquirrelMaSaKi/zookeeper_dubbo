package com.rj.dao;

import com.rj.pojo.User;

public interface UserDao {
    User findById(Integer id);
}
