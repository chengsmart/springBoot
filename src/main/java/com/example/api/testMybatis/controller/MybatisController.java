package com.example.api.testMybatis.controller;

import com.example.api.testMybatis.dao.UserMapper;
import com.example.api.testMybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/mybatis", produces = "application/json; charset=UTF-8")
public class MybatisController {

    @Autowired
    private UserService userService;
    @Autowired
    private UserMapper userMapperDao;

    @GetMapping( "/user/{userid}")
    public String getUserName(@PathVariable(value = "userid") Integer userid) {

        String  name=userService.getUserName(userid);
        return "获取到的用户姓名为："+name;
    }

}
