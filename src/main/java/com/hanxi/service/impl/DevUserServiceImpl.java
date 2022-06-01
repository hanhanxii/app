package com.hanxi.service.impl;

import com.hanxi.dao.DevUserDao;
import com.hanxi.entity.DevUser;
import com.hanxi.service.DevUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DevUserServiceImpl implements DevUserService {
    @Autowired
    private DevUserDao devUserDao;

    @Override
    public DevUser fingDevBycode(String devCode, String devPassword) {
        DevUser devUser = devUserDao.fingDevBycode(devCode);
        if (devUser != null && devUser.getDevPassword().equals(devPassword) && devUser.getDevCode().equals(devCode)){
            return  devUser;
        }
        return null;
    }
}
