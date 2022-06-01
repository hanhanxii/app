package com.hanxi.service.impl;

import com.hanxi.dao.AppCategoryDao;
import com.hanxi.entity.AppCategory;
import com.hanxi.service.AppCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AppCategoryServiceImpl implements AppCategoryService {
    @Autowired
    private AppCategoryDao appCategoryDao;

    @Override
    public List<AppCategory> getAppCategory(Long pid) {
        return appCategoryDao.getAppCategory(pid);
    }
}
