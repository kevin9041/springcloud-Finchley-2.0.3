package com.misrobot.springcloud.controller;

import com.misrobot.springcloud.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @RequestMapping(value = "/hi")
    public String hello(@RequestParam String name){
        return helloService.hello(name);
    }
    //@RequestMapping(value = "/hi/{xxx}")
    //public String hello(@PathVariable("xxx") String name){
    //    return helloService.hello(name);
    //}
}