package com.rj.service;


import com.rj.UserApi;
import com.rj.dao.UserDao;
import com.rj.pojo.User;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service(cluster = "failfast", version = "2.0")
//@MapperScan("com.rj.dao") //保证可以扫描到dao
public class UserService implements UserApi {
    @Autowired
    private UserDao userDao;

    @Override
    public User findById(Integer id) {
        return userDao.findById(id);
    }
}
