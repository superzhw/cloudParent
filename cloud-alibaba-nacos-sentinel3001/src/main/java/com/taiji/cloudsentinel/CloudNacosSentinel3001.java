package com.taiji.cloudsentinel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CloudNacosSentinel3001 {

    public static void main(String[] args) {
        SpringApplication.run(CloudNacosSentinel3001.class,args);
        System.out.println("启动成功");
    }
}
