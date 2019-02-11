package com.misrobot.springcloud.controller;

import com.misrobot.springcloud.service.HelloRibbenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/ribben")
public class HelloRibbenController {

    @Autowired
    HelloRibbenService helloRibbenService;

    @RequestMapping(value = "/testRibben")
    public String testRibben(@RequestParam("change") String name){
        return helloRibbenService.testRibben(name);
    }
}