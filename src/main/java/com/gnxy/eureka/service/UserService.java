package com.gnxy.eureka.service;

import org.springframework.stereotype.Service;

/**
 * Package:com.gnxy.eureka.service
 * ClassName:UserService
 *
 * @author:hmp
 * @date:2020/1/7 20:18
 * Description:
 */
public interface UserService {
    String getUser(int id);
    int insertUser();
}
