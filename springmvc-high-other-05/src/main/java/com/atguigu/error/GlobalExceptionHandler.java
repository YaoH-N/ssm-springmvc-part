package com.atguigu.error;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * Author: 牛耀辉
 * Date: 2024/11/17 12:58
 * Description:
 */
// 全局异常发生，会走此类下的handler方法！
//@ControllerAdvice  // 可以返回逻辑视图  转发和重定向！
@RestControllerAdvice  // === @ResponseBody+@ControllerAdvice 直接返回json字符串
public class GlobalExceptionHandler {

    // 指定的异常 可以精准查找  ，或者查找父类异常！
    @ExceptionHandler(ArithmeticException.class)
    public Object arithmeticExceptionHandler(ArithmeticException e) {
        String message = e.getMessage();
        //自定义处理异常即可 handler
        System.out.println("message = " + message);
        return message;
    }

    @ExceptionHandler(Exception.class)
    public Object arithmeticExceptionHandler(Exception e) {
        //自定义处理异常即可 handler
        String message = e.getMessage();
        System.out.println("message = " + message);
        return message;

    }
}
