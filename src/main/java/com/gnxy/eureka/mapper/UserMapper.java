package com.gnxy.eureka.mapper;

import com.gnxy.eureka.domin.UserInfo;
import org.apache.ibatis.annotations.Mapper;
/**
 * Package:com.gnxy.eureka.mapper
 * ClassName:UserMapper
 *
 * @author:hmp
 * @date:2020/1/7 20:19
 * Description:
 */
@Mapper
public interface UserMapper {
    String queryUser(int stuno);

    int insertUser(UserInfo userInfo);

    int queryUserInfo();
}
