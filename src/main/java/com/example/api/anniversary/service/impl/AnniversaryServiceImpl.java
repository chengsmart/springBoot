package com.example.api.anniversary.service.impl;

import com.example.api.anniversary.dao.InfoMapper;
import com.example.api.anniversary.entity.Anniversary;
import com.example.api.anniversary.service.AnniversaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnniversaryServiceImpl implements AnniversaryService {

    @Autowired
    private InfoMapper infoMapper;

    @Override
    public Anniversary getInfo() {
        Anniversary anniversaryInfo = infoMapper.getSweetInfo();
        return anniversaryInfo;
    }

}
