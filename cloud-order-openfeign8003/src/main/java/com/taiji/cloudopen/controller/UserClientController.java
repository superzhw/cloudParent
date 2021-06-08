package com.taiji.cloudopen.controller;

import com.taiji.cloudopen.common.Result;
import com.taiji.cloudopen.service.UserClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/open")
public class UserClientController {

    @Autowired
    private UserClientService userClientService;

    @GetMapping("/getUserId/{id}")
    @ResponseBody
    public Result getUserId(@PathVariable("id") int id){
        return userClientService.findUserById(id);
    }
}
