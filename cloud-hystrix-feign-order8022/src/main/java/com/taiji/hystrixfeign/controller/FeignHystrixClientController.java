package com.taiji.hystrixfeign.controller;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.taiji.hystrixfeign.common.Result;
import com.taiji.hystrixfeign.service.FeignClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@RestController
@DefaultProperties(defaultFallback = "globalFallbackMethod")
public class FeignHystrixClientController {

    @Autowired
    private FeignClientService feignClientService;

    /**
     * 正常访问的方法
     * @param id
     * @return
     */

    @GetMapping("/hystrix/ok/{id}")
    public Result paymentInfo_ok(@PathVariable("id") Integer id){
        return feignClientService.paymentInfo_ok(id);
    }

    /**
     * 延迟方法
     * @param id
     * @return
     */
    @GetMapping("/hystrix/timeout/{id}")
    @HystrixCommand(fallbackMethod = "paymentInfoTimeoutHandler", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "5000")
    })
    public Result paymentInfo_timeout(@PathVariable("id") Integer id){
       return feignClientService.paymentInfo_timeout(id);
    }

    public  Result paymentInfoTimeoutHandler(Integer id){
        return new Result(444,"8022消费端服务降级","paymentInfoTimeoutHandler线程池： " + Thread.currentThread().getName() + "  {}{}id:   "+id);
    }

    /**
     * 延迟方法
     * @param id
     * @return
     */
    @GetMapping("/hystrix/globe/{id}")
    @HystrixCommand
    public Result paymentInfoTimeout(@PathVariable("id") Integer id){
//        try {
//            TimeUnit.SECONDS.sleep(3);
//        }catch (Exception e){
//            e.printStackTrace();
//        }
        int a = 10/0;
        return new Result(444,"8022消费端全局正常返回",Thread.currentThread().getName());
    }

    // 下面是全局fallback方法
    public Result globalFallbackMethod()
    {
        return new Result(444,"Global异常处理信息，请稍后再试，/(ㄒoㄒ)/~~","");
    }
}
