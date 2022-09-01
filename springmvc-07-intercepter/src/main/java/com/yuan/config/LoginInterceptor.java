package com.yuan.config;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @ClassName: LoginInterceptor
 * @Description: TODO
 * @Author: yuan.wang
 * @Date: 2022/8/31-17:41
 * @Version: 1.0
 */
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();

        //放行 判断什么情况下登录
        //登录页面放行
        if (request.getRequestURI().contains("goLogin")) {
            return true;
        }

        if (request.getRequestURI().contains("login")) {
            return true;
        }
        //有session放行
        if (session.getAttribute("userLoginInfo") != null) {
            return true;
        }

        //判断什么情况下没有登录
        request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request, response);
        return false;
    }
}
