package com.yuan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author: yuan.wang
 * @Date: 2022/6/9-15:29
 */
@Controller

public class ControllerTest3{
    @RequestMapping("/c3/t1")
    public String test1(Model model){
        model.addAttribute("msg","ControllerTest3");
        return "test";
    }
}
