package com.hanxi.service.impl;

import com.hanxi.dao.BackendUserDao;
import com.hanxi.entity.BackendUser;
import com.hanxi.service.BackendUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BackendUserServiceImpl implements BackendUserService {

    @Autowired
    private BackendUserDao backendUserDao;

    @Override
    public BackendUser checkLogin(String userCode, String userPassword) {
        System.out.println(userCode);
        BackendUser bk = backendUserDao.findBackendUserBycode(userCode);
        if (bk != null && bk.getUserCode().equals(userCode) && bk.getUserPassword().equals(userPassword)){
                return bk;
        }
        return null;
    }
}
