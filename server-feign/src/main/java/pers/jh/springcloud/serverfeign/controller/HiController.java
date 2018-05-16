package pers.jh.springcloud.serverfeign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pers.jh.springcloud.serverfeign.service.HelloService;

/**
 * @program: spring cloud
 * @description: 展示服务调用的结果
 * @author: jiahao
 * @create: 2018-05-16 17:48
 **/
@RestController
public class HiController {

    @Autowired
    HelloService helloService;

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String sayHi(@RequestParam String name){
        return helloService.sayHiFromClientOne(name);
    }
}
