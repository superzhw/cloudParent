package com.taiji.cloudnacosconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CloudNacosConfig4001 {

    public static void main(String[] args) {
        SpringApplication.run(CloudNacosConfig4001.class, args);
        System.out.println("4001启动成功");
    }
}
