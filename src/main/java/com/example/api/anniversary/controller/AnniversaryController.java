package com.example.api.anniversary.controller;

import com.example.api.anniversary.dao.InfoMapper;
import com.example.api.anniversary.entity.Anniversary;
import com.example.api.anniversary.service.AnniversaryService;
import com.example.api.exception.MyException;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/lover", produces = "application/json; charset=UTF-8")
public class AnniversaryController {

    @Autowired
    private AnniversaryService anniversaryService;

    @Autowired
    private InfoMapper infoMapper;

    @ApiOperation(value = "获取用户信息", notes = "")
    @GetMapping("/info")
    public Anniversary getLoverInfo() throws Exception {
        Anniversary anniversaryInfo = anniversaryService.getInfo();
        return anniversaryInfo;
    }

    @GetMapping("/error")
    public String testError() throws MyException {
        throw new MyException("测试，发生错误了");
    }
}