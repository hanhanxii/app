package com.hanxi.controller;

import com.alibaba.fastjson.JSON;
import com.hanxi.entity.AppCategory;
import com.hanxi.service.AppCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class AppCategoryController {

    @Autowired
    private AppCategoryService appCategoryService;


    @RequestMapping("/manager/backend/app/categorylevellist")
    @ResponseBody
    public String categorylevellist(Long pid){
        List<AppCategory> appCategory = appCategoryService.getAppCategory(pid);
        String s = JSON.toJSONString(appCategory);
        return s;
    }

    @RequestMapping("/dev/flatform/app/categorylevellist")
    @ResponseBody
    public String DevCategorylevellist(Long pid){
        List<AppCategory> appCategory = appCategoryService.getAppCategory(pid);
        String s = JSON.toJSONString(appCategory);
        return s;
    }

}
