package com.hanxi.controller;

import com.alibaba.fastjson.JSON;
import com.hanxi.dao.AppInfoListDao;
import com.hanxi.entity.AppCategory;
import com.hanxi.entity.AppInfoList;
import com.hanxi.entity.DataDictionary;
import com.hanxi.service.AppCategoryService;
import com.hanxi.service.AppInfoListService;
import com.hanxi.service.DataDictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/manager")
public class BackListController {

    @Autowired
    private AppCategoryService appCategoryService;

    @Autowired
    private DataDictionaryService dataDictionaryService;

    @Autowired
    private AppInfoListService appInfoListService;


//    页面跳转   点击查询也是这个方法   少了很多参数
    @RequestMapping("backend/app/list")
    public ModelAndView appManagement(@RequestParam(value = "softwareName",required = false) String querySoftwareName,@RequestParam(value = "flatformId",required = false) String queryFlatformId,@RequestParam(value = "categoryLevel1",required = false) String queryCategoryLevel1,@RequestParam(value = "categoryLevel2",required = false) String queryCategoryLevel2,@RequestParam(value = "categoryLevel3",required = false) String queryCategoryLevel3,@RequestParam(value = "pid",required = false)Long pid,@RequestParam(value = "status",required = false)Long status){
        String typename = "APP_FLATFORM";
//        一级查询
        List<AppCategory> appCategory = appCategoryService.getAppCategory(pid);
        List<DataDictionary> allDataDictionary = dataDictionaryService.findAllDataDictionary(typename);
        ModelAndView modelAndView = new ModelAndView("backend/applist");
        modelAndView.addObject("querySoftwareName",querySoftwareName);
        modelAndView.addObject("categoryLevel1List",appCategory);
        modelAndView.addObject("flatFormList",allDataDictionary);
        status = Long.valueOf(1);
        List<AppInfoListDao> allAppInfoList = appInfoListService.getAllAppInfoList(querySoftwareName, queryFlatformId, queryCategoryLevel1, queryCategoryLevel2, queryCategoryLevel3,status);
        modelAndView.addObject("appInfoList",allAppInfoList);
        return modelAndView;
    }




}
