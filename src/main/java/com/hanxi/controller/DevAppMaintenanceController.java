package com.hanxi.controller;

import com.hanxi.dao.AppInfoListDao;
import com.hanxi.entity.AppCategory;
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
@RequestMapping("/dev")
public class DevAppMaintenanceController {

    @Autowired
    private DataDictionaryService dictionaryService;

    @Autowired
    private AppCategoryService appCategoryService;

    @Autowired
    private AppInfoListService appInfoListService;


    @RequestMapping("/flatform/app/list")
    public ModelAndView devMaintenance(@RequestParam(value = "softwareName",required = false) String querySoftwareName, @RequestParam(value = "flatformId",required = false) String queryFlatformId, @RequestParam(value = "categoryLevel1",required = false) String queryCategoryLevel1, @RequestParam(value = "categoryLevel2",required = false) String queryCategoryLevel2, @RequestParam(value = "categoryLevel3",required = false) String queryCategoryLevel3, @RequestParam(value = "pid",required = false)Long pid, @RequestParam(value = "status",required = false)Long status){
        List<DataDictionary> appState = dictionaryService.findAllDataDictionary("APP_STATUS");
        List<DataDictionary> flatFormList = dictionaryService.findAllDataDictionary("APP_FLATFORM");
        List<AppCategory> appCategory = appCategoryService.getAppCategory(null);
        ModelAndView modelAndView = new ModelAndView("developer/appinfolist");
        modelAndView.addObject("statusList",appState);
        modelAndView.addObject("flatFormList",flatFormList);
        modelAndView.addObject("categoryLevel1List",appCategory);
        List<AppInfoListDao> allAppInfoList = appInfoListService.getAllAppInfoList(querySoftwareName, queryFlatformId, queryCategoryLevel1, queryCategoryLevel2, queryCategoryLevel3, status);
        modelAndView.addObject("appInfoList",allAppInfoList);
        return modelAndView;
    }

}
