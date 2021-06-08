package com.taiji.springcloud.controller;

import cn.hutool.json.JSONObject;
import com.taiji.springcloud.common.Result;
import com.taiji.model.User;
import com.taiji.springcloud.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RestController
@Slf4j
public class UserController {
    @Resource
    private UserService userService;
    @Value("${server.port}")
    private String serverPort;

    @Autowired
    private DiscoveryClient discoveryClient;

    @ResponseBody
    @PostMapping("/user/create")
    public Result create(User user){
        Result result = null;
        int i = userService.create(user);
        if(i>0) {
            result = new Result(200,"插入成功",i);
        } else {
            result = new Result(444,"插入成功",i);
        }
        return result;
    }
    @ResponseBody
    @GetMapping("/user/findUserById/{id}")
    public Result findUserById(@PathVariable("id") int id){
        Result result = null;
        try {
            User user = userService.findUserById(id);
            if(user != null){
                result = new Result(200,"查询成功,serverPort:"+serverPort,user);
            } else {
                result = new Result(200,"查询失败serverPort:"+serverPort,null);
            }
        }catch (Exception e){
            log.info("查询异常{}"+e);
            result = new Result(200,"查询失败",null);
        }
        return result;
    }

    @GetMapping("/discovery")
    public Object discovery(){
        List<String> services = discoveryClient.getServices();
        services.forEach(service ->{
            log.info("----------"+service);
        });
        List<JSONObject> list = new ArrayList<>();
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PROVIDER-SERVICE");
        instances.forEach(instanceInfo ->{
            JSONObject jo = new JSONObject();
            jo.put("serviceId",instanceInfo.getServiceId());
            jo.put("hostname",instanceInfo.getHost());
            jo.put("port",instanceInfo.getPort());
            jo.put("uri",instanceInfo.getUri());
            list.add(jo);
        });
        return new Result(200,"服务发现",list);
    }
}
