package com.wegirl.framework.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author rui.zhou
 * @date 2021/05/06 15:46
 **/
@ComponentScan(basePackages = {"com.wegirl.framework"})
@MapperScan("com.wegirl.framework.dao.mapper")
@SpringBootApplication
public class FrameworkWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(FrameworkWebApplication.class, args);
    }

}
