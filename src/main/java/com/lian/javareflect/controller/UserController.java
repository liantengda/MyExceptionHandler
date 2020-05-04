package com.lian.javareflect.controller;

import com.lian.javareflect.common.core.pojo.response.R;
import com.lian.javareflect.model.User;
import com.lian.javareflect.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author:wjup
 * @Date: 2018/9/26 0026
 * @Time: 14:42
 */

@RestController
@RequestMapping("/")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "user/{id}",method = RequestMethod.GET)
    public R<User> GetUser(@PathVariable("id") int id){
        return new R<>(userService.sel(id));
    }

}
