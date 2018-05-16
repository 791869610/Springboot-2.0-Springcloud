package pers.jh.springcloud.serverclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
/**
 * @Description:服务提供者
 * @author: jiahao
 * @Date: 2018/5/16 16:27
 */
public class ServerclientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerclientApplication.class, args);
    }
}

