package com.hanxi.dao;

import com.hanxi.entity.AppInfo;

import java.util.List;

public interface AppInfoDao {

    public List<AppInfo> findAllAppinfo();

    public void addInfo(AppInfo appInfo);

}
