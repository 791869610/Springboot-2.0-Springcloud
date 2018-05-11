package com.spring_cloud_feign.spring_cloud_feign.controller;

import com.spring_cloud_feign.spring_cloud_feign.service.HelloService;
import feign.RequestLine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class HiController {

    @Autowired
    HelloService helloService;

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String sayHi(@RequestParam(value = "name") String name) {
        return helloService.sayHello(name);
    }
}
