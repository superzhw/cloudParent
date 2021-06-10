package com.taiji.hystrixfeign.controller;

import com.taiji.hystrixfeign.common.Result;
import com.taiji.hystrixfeign.service.FeignClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignHystrixClientController {

    @Autowired
    private FeignClientService feignClientService;

    /**
     * 正常访问的方法
     * @param id
     * @return
     */

    @GetMapping("/hystrix/ok/{id}")
    @ResponseBody
    public Result paymentInfo_ok(@PathVariable("id") Integer id){
        return feignClientService.paymentInfo_ok(id);
    }

    /**
     * 延迟方法
     * @param id
     * @return
     */
    @GetMapping("/hystrix/timeout/{id}")
    @ResponseBody
    public Result paymentInfo_timeout(@PathVariable("id") Integer id){
       return feignClientService.paymentInfo_timeout(id);
    }
}
