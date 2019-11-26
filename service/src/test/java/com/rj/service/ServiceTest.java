package com.rj.service;

import com.rj.ServiceAppStart;
import com.rj.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = ServiceAppStart.class)
public class ServiceTest {
    @Autowired
    private UserService userService;

    @Test
    public void findById() {
        User user = userService.findById(1);
        System.out.println(user);
    }
}
