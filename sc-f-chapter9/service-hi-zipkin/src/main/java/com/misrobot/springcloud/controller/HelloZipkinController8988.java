package com.misrobot.springcloud.controller;

import com.misrobot.springcloud.ServiceHiZipkinApplication;
import com.misrobot.springcloud.service.HelloZipkinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
public class HelloZipkinController8988 {

    private static final Logger LOG = Logger.getLogger(ServiceHiZipkinApplication.class.getName());

    @Autowired
    HelloZipkinService helloZipkinService;

    @RequestMapping(value = "/hi")
    public String testZipkin(){
        LOG.log(Level.INFO, "calling trace service-hi-zipkin ");
        return helloZipkinService.testZipkin();
    }

    @RequestMapping("/info")
    public String info(){
        LOG.log(Level.INFO, "calling trace service-hi-zipkin  ");
        return "i'm service-hi-zipkin ";

    }

}