package com.yuan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RestFulController {
    //映射访问路径
    @RequestMapping("/add/{p1}/{p2}")
//    @GetMapping("/add/{p1}/{p2}")
    public String test1(@PathVariable int p1, @PathVariable int p2, Model model){

        int result = p1+p2;
        //Spring MVC会自动实例化一个Model对象用于向视图中传值
        model.addAttribute("msg", "结果："+result);
        //返回视图位置
        return "test";

    }

    //映射访问路径,必须是POST请求
    @RequestMapping(value = "/hello",method = {RequestMethod.POST})
    public String test2(Model model){
        model.addAttribute("msg", "hello!");
        return "test";
    }
}