package com.hanxi.service.impl;

import com.hanxi.dao.AppInfoDao;
import com.hanxi.entity.AppInfo;
import com.hanxi.service.AppInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AppInfoServiceImpl implements AppInfoService {

        @Autowired
        private AppInfoDao appInfoDao;

    @Override
    public List<AppInfo> findAllAppinfo() {
        List<AppInfo> appInfos = appInfoDao.findAllAppinfo();
        return appInfos;
    }
}
