package com.atguigu.interceptor;

import jakarta.ejb.AfterCompletion;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * Author: 牛耀辉
 * Date: 2024/11/17 14:00
 * Description:
 */
public class MyInterceptor implements HandlerInterceptor {


    // 执行handler之前！ 调用的拦截方法
    // 编码格式设置，登录保护，权限处理！

    /**
     * @param request  请求对象
     * @param response 响应对象
     * @param handler  handler就是我们要调用的方法对象
     * @return true=放行  false=拦截
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("MyInterceptor.preHandle");
        return true;
    }


    /**
     * 当handler执行完毕后，触发的方法！ 没有拦截机制了
     *
     * @param request      请求
     * @param response     响应对象
     * @param handler      handler方法
     * @param modelAndView 返回的视图和共享域数据对象
     * @throws Exception
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("MyInterceptor.postHandle");
    }

    /**
     * 整体处理完毕调用！！
     *
     * @param request
     * @param response
     * @param handler
     * @param ex       handler 报错了  异常对象
     * @throws Exception
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("myInterceptor.afterCompletion");
    }
}
