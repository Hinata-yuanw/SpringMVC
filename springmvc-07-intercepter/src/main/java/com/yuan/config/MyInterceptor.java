package com.yuan.config;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ClassName: MyIntercpetor
 * @Description: TODO
 * @Author: yuan.wang
 * @Date: 2022/8/31-13:57
 * @Version: 1.0
 */
public class MyInterceptor implements HandlerInterceptor {

    //return true 执行下一个拦截器，放行
    //return false 不执行下一个拦截器
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("========处理前=========");
        return true;
    }


}
