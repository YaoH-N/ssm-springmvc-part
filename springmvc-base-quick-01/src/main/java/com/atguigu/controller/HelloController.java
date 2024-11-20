package com.atguigu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Author: 牛耀辉
 * Date: 2024/11/9 15:40
 * Description:
 */
@Controller
public class HelloController {

    // handler -> springmvc/hello   return "hello springmvc!!"
    @RequestMapping("springmvc/hello") //对外访问的地址 到handlerMapping注册的注解
    @ResponseBody // 直接返回字符串给前端，不要找视图解析器
    public String hello(){
        System.out.println("HelloController.hello");

        return "hello springmvc!!";
    }
}
