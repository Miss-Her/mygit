package com.miaoshaProject.controller;

import com.miaoshaProject.controller.viewObject.UserVO;
import com.miaoshaProject.response.CommonReturnType;
import com.miaoshaProject.service.UserService;
import com.miaoshaProject.service.model.UserModel;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Package:com.miaoshaProject.controller
 * ClassName:UserController
 *
 * @author:hmp
 * @date:2019/3/30 19:39
 * Description:
 */
@Controller("user")
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/get")
    @ResponseBody
    public CommonReturnType getUser(@RequestParam("id")Integer id){
        UserModel userModel = userService.getUserById(id);
        //将核心领域模型用户对象转化为前端可用的viewObject
        UserVO userVO = convertFromModel(userModel);

        //返回通用对象
        return CommonReturnType.create(userVO);
    }
    //最终返回给前端的方法
    private UserVO convertFromModel(UserModel userModel){
        if(null == userModel){
            return  null;
        }
        UserVO userVO = new UserVO();
        BeanUtils.copyProperties(userModel,userVO);
        return userVO;
    }
}
