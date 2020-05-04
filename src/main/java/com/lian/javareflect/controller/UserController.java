package com.lian.javareflect.controller;

import com.lian.javareflect.common.core.pojo.response.R;
import com.lian.javareflect.model.User;
import com.lian.javareflect.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author:wjup
 * @Date: 2018/9/26 0026
 * @Time: 14:42
 */

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public R<User> GetUser(@PathVariable("id") Integer id){
        return new R<>(userService.sel(id));
    }

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public R<List<User>> list(){
        return new R<>(userService.list());
    }

    @RequestMapping(value = "/",method = RequestMethod.POST)
    public R<User> add(@RequestBody User user){
        return new R<>(userService.add(user));
    }

    @RequestMapping(value = "/",method = RequestMethod.PUT)
    public R<User> upd(@RequestBody User user){
        return new R<>(userService.upd(user));
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public R<User> del(@PathVariable("id")Integer id){
        return new R<>(userService.del(id));
    }

}
