package com.misrobot.springcloud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloZipkinService {

    @Autowired
    RestTemplate restTemplate;

    public String testZipkin(){
        return restTemplate.getForObject("http://localhost:8989/miya", String.class);
    }
}