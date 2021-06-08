package com.taiji.cloudopen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class EutekaOpenFeignMain8003 {
    public static void main(String[] args) {
        SpringApplication.run(EutekaOpenFeignMain8003.class, args);
        System.out.println("8003启动成功！");
    }
}
