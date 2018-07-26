package com.misrobot.springcloud.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class HelloFeignServiceFallback implements HelloFeignService{

    @Override
    public String testFeign(@RequestParam(value = "name") String name) {
        return "sorry,"+name;
    }
}