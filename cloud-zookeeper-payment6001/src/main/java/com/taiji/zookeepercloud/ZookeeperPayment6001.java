package com.taiji.zookeepercloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient // 该注解用于向使用consul或者zookeeper作为注册中心时注册服务
public class ZookeeperPayment6001 {
    public static void main(String[] args) {
        SpringApplication.run(ZookeeperPayment6001.class,args);
        System.out.println("6001启动");
    }
}
