package com.lian.javareflect.service.impl;


import com.lian.javareflect.constant.UserEnum;
import com.lian.javareflect.model.User;
import com.lian.javareflect.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl  implements UserService {

    @Override
    public User sel(int id){
        User user = null;
        User user1 = new User();
        user1.setId(111);
        user1.setRealName("Ted");
        user1.setPassWord("555888");
        user1.setUserName("落葉吹雪");
        user = user1;
        UserEnum.USER_NOT_FOUND.assertNotNull(user);
        return user;
    }

}
