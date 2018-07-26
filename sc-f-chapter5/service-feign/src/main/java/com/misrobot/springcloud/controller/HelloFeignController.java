package com.misrobot.springcloud.controller;

import com.misrobot.springcloud.service.HelloFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/feign")
public class HelloFeignController {

    @Autowired
    HelloFeignService helloFeignService;

    @RequestMapping(value = "/testFeign")
    public String testFeign(@RequestParam String name){
        return helloFeignService.testFeign(name);
    }
}