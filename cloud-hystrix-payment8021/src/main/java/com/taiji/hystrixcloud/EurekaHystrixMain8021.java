package com.taiji.hystrixcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker // 启用hystrix
public class EurekaHystrixMain8021 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaHystrixMain8021.class,args);
        System.out.println("8021启动成功");
    }
}
