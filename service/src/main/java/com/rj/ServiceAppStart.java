package com.rj;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo ////开启dubbo的支持,会扫描所有dubbo相关的配置
@MapperScan("com.rj.dao")//保证可以扫描到dao
public class ServiceAppStart {
    public static void main(String[] args) {
        SpringApplication.run(ServiceAppStart.class, args);
    }
}
