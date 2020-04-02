package com.gnxy.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Package:com.gnxy.eureka
 * ClassName:UserApp
 *
 * @author:hmp
 * @date:2020/1/6 22:14
 * Description:
 */
@SpringBootApplication
//开启eureka的客户端注解
@EnableEurekaClient
public class UserApp {
    public static void main(String[] args) {
        SpringApplication.run(UserApp.class);
    }
}
