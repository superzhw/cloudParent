package com.taiji.cloudeurekaserver7001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CloudEurekaServer7001Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudEurekaServer7001Application.class, args);
        System.out.println("server7001启动");
    }

}
