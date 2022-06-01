package com.hanxi.controller;

import com.hanxi.entity.BackendUser;
import com.hanxi.service.BackendUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("manager")
public class BackController {

    @Autowired
    private BackendUserService backendUserService;


//    注销
    @RequestMapping("/logout")
    public String logOut(){
        return "backendlogin";
    }




//    页面登录验证
    @RequestMapping("/dologin")
    public String backLogin(String userCode, String userPassword, HttpServletRequest request){
        BackendUser backendUser = backendUserService.checkLogin(userCode, userPassword);
        if (backendUser == null){
            System.out.println("登录失败");
            return "backendlogin";
        }
        HttpSession session = request.getSession();
        session.setAttribute("userSession",backendUser);
        return "backend/main";
    }
}
