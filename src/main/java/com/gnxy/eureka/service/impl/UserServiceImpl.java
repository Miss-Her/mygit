package com.gnxy.eureka.service.impl;

import com.gnxy.eureka.domin.UserInfo;
import com.gnxy.eureka.mapper.UserMapper;
import com.gnxy.eureka.service.UserService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Package:com.gnxy.eureka.service.impl
 * ClassName:UserServiceImpl
 *
 * @author:hmp
 * @date:2020/1/7 20:34
 * Description:
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public String getUser(int stuno) {
        return userMapper.queryUser(stuno);
    }

    @Override
    public int insertUser() {
        int stuno = userMapper.queryUserInfo();
        stuno+=1;
        UserInfo userInfo = new UserInfo(stuno,"老赵"+stuno+"",25+stuno,"东北"+stuno+"");
        return userMapper.insertUser(userInfo);
    }
}
