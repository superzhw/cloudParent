package com.taiji.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class EurekaPayMentMain8001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaPayMentMain8001.class, args);
        System.out.println("8001启动成功");
    }
}
