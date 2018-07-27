package com.misrobot.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/config")
@RefreshScope
public class HelloConfigController {

    @Value("${foo}")
    private String foo;

    @RequestMapping(value = "/getVar")
    //http://localhost:8881/actuator/bus-refresh(post请求)----->Request method 'GET' not supported
    //@RequestMapping(value = "/getVar",method = RequestMethod.GET)


    ///actuator/bus-refresh接口可以指定服务，即使用”destination”参数，比如 “/actuator/bus-refresh?destination=customers:**” 即刷新服务名为customers的所有服务

    public String getVar(){
        return foo;
    }
}