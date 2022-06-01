package com.hanxi.dao;

import com.hanxi.entity.AppCategory;

import java.util.List;

public interface AppCategoryDao {

    public List<AppCategory> getAppCategory(Long pid);
}
