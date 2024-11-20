package com.atguigu.controller;

import com.atguigu.pojo.User;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: 牛耀辉
 * Date: 2024/11/17 12:46
 * Description:
 */
@Controller
@RequestMapping("user")
@ResponseBody
public class UserController {

    // 接收用户数据，用户有校验注解
    /**
     * 步骤1：实体类属性添加校验注解
     * 步骤2：handler(@validated 实体类 对象)
     * 细节： param | json 校验注解都有效果
     * json参数 - @RequestBody
     * <p>
     * 天坑：如果不符合校验规则，直接向前端抛出异常
     * 接收错误绑定信息！ 自定义返回结果！  约定：参数错误 -> {code:400}  ->  前端
     * 捕捉错误绑定错误信息：
     * 1 handler(校验对象,BindingRequest result)  要求：bindingResult必须紧挨着 校验对象
     * 2. bindingresult 获取绑定错误
     */
    @PostMapping("register")
    public Object register(@Validated @RequestBody User user, BindingResult result, HttpSession session) {

        if (result.hasErrors()) {
            // 有绑定错误，就不直接返回了，由我们自己决定！
            Map data = new HashMap();
            data.put("code", 400);
            data.put("msg", "参数校验异常了！");
            return data;
        }
        System.out.println("user = " + user);
        return user;
    }

    @GetMapping("data")
    public String data() {
        // 空指针异常
//        String name = null;
//        name.toString();
        System.out.println("UserController.data");
        return "ok";
    }

    @GetMapping("data1")
    public String data1() {
        //算数异常
//        int i = 1 / 0;
        System.out.println("UserController.data1");
        return "ok";
    }

}