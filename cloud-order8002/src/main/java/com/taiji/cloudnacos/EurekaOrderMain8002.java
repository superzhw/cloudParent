package com.taiji.cloudnacos;

import com.taiji.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "CLOUD-PROVIDER-SERVICE", configuration = MySelfRule.class)
public class EurekaOrderMain8002 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaOrderMain8002.class,args);
        System.out.println("8002启动成功");
    }
}
