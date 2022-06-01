package com.hanxi.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/dev")
public class DevAppController {

        //新增app基础信息
        @RequestMapping("/flatform/app/appinfoadd")
        public String addApp(){
            return "developer/appinfoadd";
        }

        //        修改app
        @RequestMapping("/flatform/app/appinfomodify")
        public String modifyApp(){
            return "developer/appinfomodify";
        }


//查看app
        @RequestMapping("/flatform/app/appview")
        public String showApp(Integer id){
            System.out.println("id");
             return "developer/appinfoview";
         }

//    修改app最新版本
         @RequestMapping("/flatform/app/appversionmodify")
        public String modifyAppVersion(){
            return "developer/appversionmodify";
         }

//         新增app最新版本
         @RequestMapping("/flatform/app/appversionadd")
         public String addAppVersion(){
            return "developer/appversionadd";
         }

}
