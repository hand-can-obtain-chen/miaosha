package com.ptb.miaosha.service;

import com.ptb.miaosha.error.BusinessException;
import com.ptb.miaosha.service.model.UserModel;

public interface UserService {

    //通过用户ID获取用户对象的方法
    UserModel getUserById(int id);

    //用户注册
    void register(UserModel userModel) throws BusinessException;

    //用户登录
    /**
     *
     * @param telephone 用户的手机号
     * @param encrptPassword 用户加密后的密码
     * @throws BusinessException
     */
    UserModel validateLogin(String telephone,String encrptPassword) throws BusinessException;
}
