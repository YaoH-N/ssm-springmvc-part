package com.atguigu.controller;

import com.atguigu.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Author: 牛耀辉
 * Date: 2024/11/17 00:21
 * Description:
 */
@RequestMapping("user")
@RestController
public class UserController {

    @GetMapping
    public List<User> page(@RequestParam(required = false, defaultValue = "1") int page,
                           @RequestParam(required = false, defaultValue = "10") int size) {
        System.out.println("page = " + page + ", size = " + size);
        return null;
    }

    @PostMapping
    public User save(@RequestBody User user) {
        System.out.println("save = " + user);
        return user;
    }

    @GetMapping("{id}")
    public User detail(@PathVariable(value = "id") Integer id) {
        System.out.println("id = " + id);
        return null;
    }

    @PutMapping
    public User update(@RequestBody User user) {
        System.out.println("update = " + user);
        return user;
    }

    @DeleteMapping("{id}")
    public User delete(@PathVariable(value = "id") Integer id) {
        System.out.println("delete = " + id);
        return null;
    }

    @GetMapping("search")
    public List<User> search(String keyword,
                             @RequestParam(required = false, defaultValue = "1") int page,
                             @RequestParam(required = false, defaultValue = "10") int size) {

        System.out.println("search = keyword = " + keyword + ", page = " + page + ", size = " + size);
        return null;
    }
}
