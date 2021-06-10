package com.taiji.hystrixfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class HystrixFeignMain8022 {

    public static void main(String[] args) {
        SpringApplication.run(HystrixFeignMain8022.class, args);
        System.out.println("8022启动成功");
    }
}
