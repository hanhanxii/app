package com.hanxi.dao;

import com.hanxi.entity.BackendUser;

public interface BackendUserDao {

    public BackendUser findBackendUserBycode(String userCode);

}
