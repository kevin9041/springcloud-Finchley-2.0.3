package com.misrobot.springcloud.controller;

import com.misrobot.springcloud.ServiceMiyaZipkinApplication;
import com.misrobot.springcloud.service.HelloZipkinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
public class HelloZipkinController8989 {

    private static final Logger LOG = Logger.getLogger(ServiceMiyaZipkinApplication.class.getName());

    @Autowired
    HelloZipkinService helloZipkinService;

    @RequestMapping(value = "/miya")
    public String testZipkin(){
        LOG.log(Level.INFO, "info is being called");
        return helloZipkinService.testZipkin();
    }

    @RequestMapping("/hi")
    public String home(){
        LOG.log(Level.INFO, "hi is being called");
        return "hi i'm miya!";
    }

}