package com.lian.javareflect.service;

import com.lian.javareflect.model.User;

/**
 *
 */
public interface UserService {
   /**
    * 查询用户信息
    *
    * @param id 用户信息主键
    * @return
    */
   User sel(int id);

}
