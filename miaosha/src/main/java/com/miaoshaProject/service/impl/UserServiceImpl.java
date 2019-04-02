package com.miaoshaProject.service.impl;

import com.miaoshaProject.dao.UserDOMapper;
import com.miaoshaProject.dao.UserPasswordDOMapper;
import com.miaoshaProject.dataObject.UserDO;
import com.miaoshaProject.dataObject.UserPasswordDO;
import com.miaoshaProject.service.UserService;
import com.miaoshaProject.service.model.UserModel;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Package:com.miaoshaProject.service.impl
 * ClassName:UserServiceImpl
 *
 * @author:hmp
 * @date:2019/3/30 19:43
 * Description:
 */
@Service
public class UserServiceImpl implements UserService {
    
    @Autowired
    private UserDOMapper userDOMapper;
    @Autowired
    private UserPasswordDOMapper userPasswordDOMapper;

    @Override
    public UserModel getUserById(Integer id) {
        UserDO userDO = userDOMapper.selectByPrimaryKey(id);
        if (null == userDO) {
            return null;
        }

        //通过用户id获取对应的用户加密密码
        UserPasswordDO userPasswordDO = userPasswordDOMapper.selectByUserId(userDO.getId());
        return convertFromDataObject(userDO,userPasswordDO);
    }


    //真正要返回控制层的模型
    private UserModel convertFromDataObject(UserDO userDO, UserPasswordDO userPasswordDO){

        if (null == userDO) {
            return null;
        }
        UserModel userModel = new UserModel();
        BeanUtils.copyProperties(userDO,userModel);
        if (null != userPasswordDO) {
            userModel.setEncrptPassword(userPasswordDO.getEncrptPassword());
        }

        return userModel;

    }
}
