package com.atguigu.config;

import com.atguigu.interceptor.MyInterceptor;
import com.atguigu.interceptor.MyInterceptor1;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

/**
 * Author: 牛耀辉
 * Date: 2024/11/17 12:49
 * Description:
 */
@Configuration
@ComponentScan({"com.atguigu.controller", "com.atguigu.error"})
@EnableWebMvc
public class MvcConfig implements WebMvcConfigurer {

//    @Override
//    public void configureViewResolvers(ViewResolverRegistry registry) {
//        registry.jsp("/WEB-INF/jsp/", "jsp");
//    }

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 配置方案1：拦截全部请求
//        registry.addInterceptor(new MyInterceptor());

        // 配置方案2：指定地址拦截  .addPathPatterns("/user/data");
        // * 任意一层字符串  ** 任意多层字符串
//        registry.addInterceptor(new MyInterceptor()).addPathPatterns("/user/**");

        // 配置方案3：排除拦截 排除的地址应该在拦截地址内部
//        registry.addInterceptor(new MyInterceptor()).addPathPatterns("/user/**").excludePathPatterns("/user/data1");

        registry.addInterceptor(new MyInterceptor());
        registry.addInterceptor(new MyInterceptor1());
    }
}
