package com.spring_cloud_feign.spring_cloud_feign.serviceImpl;

import com.spring_cloud_feign.spring_cloud_feign.service.HelloService;
import org.springframework.stereotype.Component;

@Component
public class HelloServiceImpl implements HelloService{

    @Override
    public String sayHello(String name) {
        return "sorry "+name;
    }
}
