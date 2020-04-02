package com.gnxy.eureka.controller;

import com.gnxy.eureka.domin.User;
import com.gnxy.eureka.service.UserService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Package:com.gnxy.eureka.controller
 * ClassName:UserController
 *
 * @author:hmp
 * @date:2020/1/6 22:18
 * Description:
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @Value("${server.port}")
    private String port;

    @RequestMapping("/user/{id}")
    public String getUser(@PathVariable("id") int stuno){

        String name = userService.getUser(stuno);
        if (StringUtils.isNotEmpty(name)){
            return name;
        }else{
            return port;
        }
    }
    @RequestMapping("/user2")
    public String getUser2(User user){

        return user.toString();
    }

    @RequestMapping("/user/insertUser")
    public String insertUser(){

        int count = userService.insertUser();
        if (count>=1){
            return "新增成功";
        }else {
            return "新增失败";
        }
    }
}
