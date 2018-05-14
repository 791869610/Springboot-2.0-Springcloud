package com.spring_cloud_config_client.spring_cloud_config_client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {

    //读取git配置文件参数注入
    @Value("${name}")
    String name;

    @Value("${port}")
    String port;

    @Value("${type}")
    String type;

    @RequestMapping(value = "/hi")
    public String hi(){
        return "name=>"+name+"port=>"+type+"name=>"+type;
    }
}
