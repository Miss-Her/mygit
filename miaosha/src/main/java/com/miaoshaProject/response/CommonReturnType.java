package com.miaoshaProject.response;

/**
 * Package:com.miaoshaProject.response
 * ClassName:CommonReturnType
 *
 * @author:hmp
 * @date:2019/3/30 21:04
 * Description:
 */
public class CommonReturnType {

    //返回结果是成功还是失败
    private String status;

    //成功则返回前端json
    //否则返回通用的错误格式
    private Object data;

    public static CommonReturnType create(Object result){
        return CommonReturnType.create(result,"success");

    }
    public static CommonReturnType create(Object result,String status){
        CommonReturnType type = new CommonReturnType();
        type.setData(result);
        type.setStatus(status);
        return type;

    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
