package com.misrobot.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/config")
public class HelloConfigController {

    @Value("${foo}")
    private String foo;

    @RequestMapping(value = "/getVar",method = RequestMethod.GET)
    public String getVar(){
        return foo;
    }
}