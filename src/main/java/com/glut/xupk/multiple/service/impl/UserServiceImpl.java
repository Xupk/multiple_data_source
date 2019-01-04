package com.glut.xupk.multiple.service.impl;

import com.glut.xupk.multiple.dao.mysql.UserMapper;
import com.glut.xupk.multiple.pojo.mysql.User;
import com.glut.xupk.multiple.pojo.mysql.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl {

    @Autowired
    UserMapper userMapper;

    public List<User> getAllUsers(){
        UserExample userExample = new UserExample();
        userExample.createCriteria().andIdIsNotNull();
        List<User> list = userMapper.selectByExample(userExample);
        return list;
    }
}
