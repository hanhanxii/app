package com.hanxi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/manager")
public class ManagerController {
    /**
     * 纯页面跳转
     * @return
     */
    @RequestMapping("/login")
    public String managerLogin(){
        return "backendlogin";
    }


    @RequestMapping("/dev/login")
    public String devLogin(){
        return "devlogin";
    }


}
