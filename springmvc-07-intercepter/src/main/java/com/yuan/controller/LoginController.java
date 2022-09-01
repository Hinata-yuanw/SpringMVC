package com.yuan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * @ClassName: LoginController
 * @Description: TODO
 * @Author: yuan.wang
 * @Date: 2022/8/31-16:35
 * @Version: 1.0
 */
@Controller
@RequestMapping("/user")
public class LoginController {

    @RequestMapping("/main")
    public String main(){
        return "main";
    }

    @RequestMapping("/goLogin")
    public String login(){
        return "login";
    }

    @RequestMapping("/login")
    public String login(HttpSession session, String username, String password, Model model) {
        //把用户信息存在session中
        session.setAttribute("userLoginInfo", username);
        model.addAttribute("username",username);
        return "main";
    }

    @RequestMapping("/goOut")
    public String login(HttpSession session) {
        //把用户信息存在session中
        session.removeAttribute("userLoginInfo");
        return "main";
    }
}
