package com.annietest.hello.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: liuna
 * @Description: ${description}
 * @Date: 2021-02-12 19:54
 * @Version: 1.0
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
      return "hello world";
    }
}
