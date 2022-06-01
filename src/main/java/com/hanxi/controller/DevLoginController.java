package com.hanxi.controller;

import com.hanxi.entity.DevUser;
import com.hanxi.service.DevUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class DevLoginController {
    @Autowired
    private DevUserService devUserService;

    @RequestMapping("dev/logout")
    public String devLogOut(){
        return "devlogin";
    }




//    验证登录
    @RequestMapping("manager/dev/dologin")
    public String devLogin(String devCode, String devPassword, HttpServletRequest request){
        System.out.println("--------------------------------");
        DevUser devUser = devUserService.fingDevBycode(devCode,devPassword);
          if (devUser == null){
              return "devlogin";
          }
          HttpSession session = request.getSession();
         session.setAttribute("devUserSession",devUser);
         return "developer/main";
    }


    //    验证登录
    @RequestMapping("/dev/dologin")
    public String devLogin2(String devCode, String devPassword, HttpServletRequest request){
        DevUser devUser = devUserService.fingDevBycode(devCode,devPassword);
        if (devUser == null){
            return "devlogin";
        }
        HttpSession session = request.getSession();
        session.setAttribute("devUserSession",devUser);
        return "developer/main";
    }



}
