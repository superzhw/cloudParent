package com.taiji.cloudnacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CloudNacosPayment5001 {
    public static void main(String[] args) {
        SpringApplication.run(CloudNacosPayment5001.class,args);
        System.out.println("5001启动成功");
    }
}
