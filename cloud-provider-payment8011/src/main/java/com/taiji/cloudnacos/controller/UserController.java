package com.taiji.cloudnacos.controller;

import com.taiji.cloudnacos.common.Result;
import com.taiji.model.User;
import com.taiji.cloudnacos.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@Slf4j
public class UserController {
    @Resource
    private UserService userService;

    @Value("${server.port}")
    private String serverPort;

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
}
