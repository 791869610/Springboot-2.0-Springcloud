package pers.jh.springcloud.serverribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pers.jh.springcloud.serverribbon.service.HelloService;

@RestController
/**
 * @program: spring cloud
 * @description: controller
 * @author: jiahao
 * @create: 2018-05-16 17:10
 **/
public class Controller {

    @Autowired
    HelloService helloService;

    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name){
        return helloService.hiService(name);
    }
}

