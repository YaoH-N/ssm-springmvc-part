package com.atguigu.json;

import com.atguigu.pojo.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Author: 牛耀辉
 * Date: 2024/11/10 23:34
 * Description:
 */
@Controller
@RequestMapping("json")
@ResponseBody
public class JsonController {

    // data -> 请求体 post {name,age,gender}
    // 前端 -> json -> 为什么报415异常  不支持数据类型呢？
    // 原因： Java原生的api，只支持路径参数和param参数   request.getParameter("key"); param  不支持json
    //       json本身就是前端的格式

    //解决：1. 导入json处理的依赖  2. 为handlerAdapter配置json转化器
    @PostMapping("data")
    public String data(@RequestBody Person person) {
        System.out.println("person = " + person);
        return "person = " + person;
    }
}
