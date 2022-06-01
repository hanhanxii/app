package com.hanxi.service.impl;

import com.hanxi.dao.AppInfoListDao;
import com.hanxi.service.AppInfoListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AppInfoListServiceImpl implements AppInfoListService {
    @Autowired
    private AppInfoListDao appInfoListDao;


    @Override
    public List<AppInfoListDao> getAllAppInfoList(String querySoftwareName, String queryFlatformId, String queryCategoryLevel1, String queryCategoryLevel2, String queryCategoryLevel3,Long status) {
        return appInfoListDao.getAllAppInfoList(querySoftwareName,queryFlatformId,queryCategoryLevel1,queryCategoryLevel2,queryCategoryLevel3,status);
    }
}
