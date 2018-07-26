package com.misrobot.springcloud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloRibbenService {

    @Autowired
    RestTemplate template;

    public String testRibben(String name){
        return template.getForObject("http://service-hi-application/hi?name="+ name,String.class);
    }
}