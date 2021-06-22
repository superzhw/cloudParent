package com.taiji.cloudgetway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CloudGetway80 {

    public static void main(String[] args) {
        SpringApplication.run(CloudGetway80.class, args);
        System.out.println("9001启动成功");
    }
}
