package com.lt.springboot.cloud.zhucezhongxin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringbootCloudZhucezhongxinApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootCloudZhucezhongxinApplication.class, args);
	}
}
