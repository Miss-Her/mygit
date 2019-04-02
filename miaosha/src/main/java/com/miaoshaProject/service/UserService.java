package com.miaoshaProject.service;

import com.miaoshaProject.service.model.UserModel;

/**
 * Package:com.miaoshaProject.service
 * ClassName:UserService
 *
 * @author:hmp
 * @date:2019/3/30 19:42
 * Description:
 */
public interface UserService {

    //通过用户的ID获取对象的方法
     UserModel getUserById(Integer id);
}
