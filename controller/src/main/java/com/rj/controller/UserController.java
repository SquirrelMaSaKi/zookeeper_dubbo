package com.rj.controller;

import com.rj.UserApi;
import com.rj.pojo.User;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    /**
     * 超时，则不能调用；
     * cluster集群容错，直发器一次调用，失败立即报错;
     * version，会在地址中调用这个handler,如果版本不一致则调用失败，所以在服务端应该也有相应的版本号，匹配才可以
     */
    @Reference(timeout = 10000, cluster = "failfast", version = "2.0")
    private UserApi userApi;

    @RequestMapping("/query/{id}")
    public User findById(@PathVariable("id") Integer id) {
        return userApi.findById(id);
    }
}
