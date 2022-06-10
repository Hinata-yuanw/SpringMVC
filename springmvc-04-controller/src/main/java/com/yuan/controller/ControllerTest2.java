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
//@Controller代表这个类会被spring接管 被这个注解的类，中所有的方法，如果返回值是string，并且有具体的页面可以跳转，name就会被视图解析器解析
@Controller
public class ControllerTest2{

    //映射访问路径
    @RequestMapping("/t2")
    public String test2(Model model){
        //Spring MVC会自动实例化一个Model对象用于向视图中传值
        model.addAttribute("msg", "ControllerTest2");
        //返回视图位置
        return "test";
    }

    @RequestMapping("/t3")
    public String test3(Model model){
        model.addAttribute("msg", "ControllerTest3");
        return "test";
    }

}
