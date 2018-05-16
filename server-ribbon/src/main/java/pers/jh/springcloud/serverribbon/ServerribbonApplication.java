package pers.jh.springcloud.serverribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableDiscoveryClient/**向服务中心注册*/
@SpringBootApplication
/** 
* @Description: 服务消费者
* @author: jiahao
* @Date: 2018/5/16 16:53
*/ 
public class ServerribbonApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerribbonApplication.class, args);
	}

    @Bean
    @LoadBalanced/**表明这个restRemplate开启负载均衡的功能*/
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
