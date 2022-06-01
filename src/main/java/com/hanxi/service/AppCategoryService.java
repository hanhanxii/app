package com.hanxi.service;

import com.hanxi.entity.AppCategory;

import java.util.List;

public interface AppCategoryService {

    public List<AppCategory> getAppCategory(Long pid);

}
