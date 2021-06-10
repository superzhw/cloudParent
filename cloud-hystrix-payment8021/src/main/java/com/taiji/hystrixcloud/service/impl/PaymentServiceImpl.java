package com.taiji.hystrixcloud.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.taiji.hystrixcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class PaymentServiceImpl implements PaymentService {

    /**
     * 正常访问的方法
     * @param id
     * @return
     */
    public  String paymentInfo_ok(Integer id){
        return "线程池： " + Thread.currentThread().getName() + "  {}{}id:   "+id + "\t" +"ok";
    }

    /**
     * 延迟方法
     * 服务降级：一旦调用服务方法失败并抛出了错误信息后，会自动调用@HystrixCommand标注好的fallbackMethod调用类中的指定方法
     * 不管是超时异常还是运行异常，只要当前服务不可用了，都做服务降级，执行的方法为paymentInfo_TimeoutHandler
     * @param id
     * @return
     */
    @HystrixCommand(fallbackMethod = "paymentInfo_TimeoutHandler", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "5000")
    })
    public  String paymentInfo_timeout(Integer id){
        int time = 3;
        try{
            TimeUnit.SECONDS.sleep(time);
        }catch (Exception e){
            e.printStackTrace();
        }
        return "8021正常线程池： " + Thread.currentThread().getName() + "  {}{}id:   "+id + "\t" +"延迟（秒）："+time;
    }

    public  String paymentInfo_TimeoutHandler(Integer id){
        return "8021超时或运行异常paymentInfo_TimeoutHandler线程池： " + Thread.currentThread().getName() + "  {}{}id:   "+id;
    }
}
