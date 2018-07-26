package com.misrobot.springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Service
@FeignClient(value = "service-hi-application",fallback = HelloFeignServiceFallback.class)
public interface HelloFeignService {

    @RequestMapping(value = "/hi")
    public String testFeign(@RequestParam(value = "name") String name);
}