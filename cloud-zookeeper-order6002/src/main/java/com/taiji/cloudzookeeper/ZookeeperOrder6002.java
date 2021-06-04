package com.taiji.cloudzookeeper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient // 该注解用于向使用consul或者zookeeper作为注册中心时注册服务
public class ZookeeperOrder6002 {

    public static void main(String[] args) {
        SpringApplication.run(ZookeeperOrder6002.class,args);
        System.out.println("6002启动");
    }
}
