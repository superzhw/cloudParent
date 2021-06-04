package com.taiji.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaOrderMain8002 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaOrderMain8002.class,args);
        System.out.println("8002启动成功");
    }
}
