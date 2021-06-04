package com.taiji.consulsloud.controller;

import com.taiji.consulsloud.common.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class OrderController {

    private static final String uri = "http://cloud-consul-payment";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/order/getInfo")
    @ResponseBody
    public Result getInfo(){
        String forObject = restTemplate.getForObject(uri + "/consulPayment/user/consul", String.class);
        return new Result(200,"调用consul成功",forObject);
    }
}
