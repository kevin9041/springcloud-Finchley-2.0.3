package com.misrobot.springcloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloRibbenService {

    @Autowired
    RestTemplate template;

    @HystrixCommand(fallbackMethod = "testRibbenFallback")
    public String testRibben(String name){
        return template.getForObject("http://service-hi-application/hi?name="+ name,String.class);
    }

    public String testRibbenFallback(String name){
        return "service-hi-application service error ！";
    }
}