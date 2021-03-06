package com.yuan.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author: yuan.wang
 * @Date: 2022/6/7-20:12
 */
public class HelloController implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {

        ModelAndView mv = new ModelAndView();

        //业务代码
        String result = "HelloSpringMVC";
        mv.addObject("msg",result);

        //视图跳转
        mv.setViewName("test");

        return mv;
    }
}
