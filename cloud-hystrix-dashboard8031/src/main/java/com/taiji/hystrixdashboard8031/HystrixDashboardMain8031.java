package com.taiji.hystrixdashboard8031;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashboardMain8031 {
    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboardMain8031.class, args);
        System.out.println("8031启动成功");
    }
}
