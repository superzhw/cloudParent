package com.taiji.cloudnacos.controller;

import com.taiji.cloudnacos.common.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
@RequestMapping("/oder")
public class OrderController {

//    private static final String url = "http://localhost:8001";
    private static final String url = "http://CLOUD-PROVIDER-SERVICE";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/findById/{id}")
    @ResponseBody
    public Result findById(@PathVariable int id){
        return new Result(200,"查询成功",restTemplate.getForObject(url+"/cloud/user/findUserById?id="+id,String.class));
    }
}
