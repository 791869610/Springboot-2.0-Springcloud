package com.spring_cloud_client2.spring_cloud_client2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SpringCloudClient2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudClient2Application.class, args);
	}
}
