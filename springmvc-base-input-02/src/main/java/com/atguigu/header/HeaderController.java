package com.atguigu.header;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Author: 牛耀辉
 * Date: 2024/11/15 22:27
 * Description: 获取请求头
 */
@Controller
@RequestMapping("header")
@ResponseBody
public class HeaderController {

    @GetMapping("data")
    public String data(@RequestHeader("Host") String host){
        System.out.println("host = " + host);
        return "host = " + host;
    }
}
