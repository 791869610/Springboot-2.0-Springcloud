package pers.jh.springcloud.serverfeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
@Repository
@FeignClient(value = "service-hi")/**指定调用的服务名称*/
/** 
* @Description:  定义一个接口来调用服务
* @author: jiahao
* @Date: 2018/5/16 17:46
*/
public interface HelloService {

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
  /** 
  * description  
  * @param  name
  * @return  java.lang.String 
  * @author  jiahao 
  * @Date  2018/5/16 18:13
  */ 
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
