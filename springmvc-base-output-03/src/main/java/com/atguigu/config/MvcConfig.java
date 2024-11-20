package com.atguigu.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Author: 牛耀辉
 * Date: 2024/11/16 16:49
 * Description: mvc组件的配置类
 */
@Configuration
@ComponentScan("com.atguigu.json")
@EnableWebMvc
public class MvcConfig implements WebMvcConfigurer {

    // @EnableWebMvc -> handlerMapping  handlerAdapter  json转化器
    // 视图解析器，指定前后缀

    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        // registry 可以快速添加前后缀
        registry.jsp("/WEB-INF/views/", ".jsp");

        // handler -> index
    }

    // 开启静态资源查找
    // dispatcherServlet -> handlerMapping找有没有对应的handler -> [没有 -> 找有没有静态资源]
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }
}
