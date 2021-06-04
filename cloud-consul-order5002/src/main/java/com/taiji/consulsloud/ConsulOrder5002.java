package com.taiji.consulsloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ConsulOrder5002 {
    public static void main(String[] args) {
        SpringApplication.run(ConsulOrder5002.class,args);
        System.out.println("5002启动");
    }
}
