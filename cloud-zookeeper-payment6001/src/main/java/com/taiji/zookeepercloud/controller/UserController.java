package com.taiji.zookeepercloud.controller;

import com.taiji.zookeepercloud.common.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@Slf4j
public class UserController {

    @Value("${server.port}")
    private String serverPort;

    @ResponseBody
    @GetMapping("/user/zk")
    public Result create(){
        return new Result(200,"zookeeper服务",serverPort+"{}{}{}" + UUID.randomUUID().toString());
    }
}
