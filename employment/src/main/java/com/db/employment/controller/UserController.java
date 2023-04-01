package com.db.employment.controller;

import com.alibaba.fastjson.JSON;
import com.db.employment.pojo.User;
import com.db.employment.pojo.UserParam;
import com.db.employment.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("/user")
@CrossOrigin(allowCredentials = "true")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public String getUser(@RequestBody UserParam userParam){
        User user = userService.getUser(userParam);
        return JSON.toJSONString(user);
    }

    @PostMapping("/register")
    public String register(@RequestBody User user){
        int i = userService.insertUser(user);
        if(i > 0){
            return "注册成功！";
        }else{
            return "注册失败！";
        }
    }

}
