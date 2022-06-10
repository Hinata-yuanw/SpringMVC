package com.yuan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: yuan.wang
 * @Date: 2022/6/8-18:11
 */
@Controller
public class HelloController {
    //
    @RequestMapping("/hello")
    public String hello(Model model){
        //封装数据
        model.addAttribute("msg","hello,SpringMVCAnnotation!");
        return "hello"; //会被视图解析器处理
    }
}
