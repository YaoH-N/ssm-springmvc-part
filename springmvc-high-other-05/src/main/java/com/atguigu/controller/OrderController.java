package com.atguigu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Author: 牛耀辉
 * Date: 2024/11/17 12:46
 * Description:
 */
@Controller
@RequestMapping("order")
@ResponseBody
public class OrderController {

    @GetMapping("data")
    public String data() {
        System.out.println("OrderController.data");
        return "ok";
    }

    @GetMapping("data1")
    public String data1() {
        System.out.println("OrderController.data1");
        return "ok";
    }

}
