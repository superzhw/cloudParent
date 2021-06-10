package com.taiji.hystrixcloud.controller;

import com.taiji.hystrixcloud.common.Result;
import com.taiji.hystrixcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    /**
     * 正常访问的方法
     * @param id
     * @return
     */

    @GetMapping("/hystrix/ok/{id}")
    @ResponseBody
    public Result paymentInfo_ok(@PathVariable("id") Integer id){
        String s = paymentService.paymentInfo_ok(id);
        return new Result(200,"正常接口返回",s);

    }

    /**
     * 延迟方法
     * @param id
     * @return
     */
    @GetMapping("/hystrix/timeout/{id}")
    @ResponseBody
    public Result paymentInfo_timeout(@PathVariable("id") Integer id){
        String s = paymentService.paymentInfo_timeout(id);
        return new Result(200,"延迟方法",s);
    }

}
