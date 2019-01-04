package com.glut.xupk.multiple.controller;

import com.glut.xupk.multiple.pojo.mysql.User;
import com.glut.xupk.multiple.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    UserServiceImpl userService;

    @RequestMapping("getAllUsers")
    @ResponseBody
    public Map<String,Object> getAllUsers(){
        List<User> list = userService.getAllUsers();
        Map<String,Object> result = new HashMap<>();
        result.put("result",list);
        result.put("msg","success");
        return result;
    }
}
