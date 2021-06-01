package com.taiji.springcloud.controller;

import com.taiji.springcloud.common.Result;
import com.taiji.model.User;
import com.taiji.springcloud.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@Slf4j
public class UserController {
    @Resource
    private UserService userService;

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
    @GetMapping("/user/findUserById")
    public Result findUserById(int id){
        Result result = null;
        try {
            User user = userService.findUserById(id);
            if(user != null){
                result = new Result(200,"查询成功",user);
            } else {
                result = new Result(200,"查询失败",null);
            }
        }catch (Exception e){
            log.info("查询异常{}"+e);
            result = new Result(200,"查询失败",null);
        }
        return result;
    }
}
