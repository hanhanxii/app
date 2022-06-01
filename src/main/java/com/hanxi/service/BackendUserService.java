package com.hanxi.service;

import com.hanxi.entity.BackendUser;

public interface BackendUserService {

    public BackendUser checkLogin(String userCode, String userPassword);

}
