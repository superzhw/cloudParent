package com.taiji.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PayMentMain8011 {
    public static void main(String[] args) {
        SpringApplication.run(PayMentMain8011.class, args);
        System.out.println("8011启动成功");
    }
}
