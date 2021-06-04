package com.taiji.cloudzookeeper.controller;

import com.taiji.cloudzookeeper.common.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class OrderController {

    private static final String uri = "http://cloud-zookeeper-payment";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/order/getInfo")
    @ResponseBody
    public Result getInfo(){
        String forObject = restTemplate.getForObject(uri + "/zookeeperPayment/user/zk", String.class);
        return new Result(200,"调用zookeeper成功",forObject);
    }
}
