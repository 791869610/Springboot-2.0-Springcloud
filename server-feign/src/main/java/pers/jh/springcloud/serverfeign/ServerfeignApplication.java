package pers.jh.springcloud.serverfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients/**注解开启Feign的功能*/
@EnableDiscoveryClient/**向服务中心注册*/
@SpringBootApplication
/** 
* @Description: feign消费服务
* @author: jiahao
* @Date: 2018/5/16 17:41
*/ 
public class ServerfeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerfeignApplication.class, args);
	}
}
