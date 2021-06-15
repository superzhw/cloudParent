package com.taiji.hystrixfeign.service;

import com.taiji.hystrixfeign.common.Result;
import com.taiji.hystrixfeign.service.impl.FeignClientServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(value = "CLOUD-HYSTRIX-SERVICE", fallback = FeignClientServiceImpl.class)
public interface FeignClientService {
    /**
     * 正常访问的方法
     * @param id
     * @return
     */

    @GetMapping("/hystrix-test/hystrix/ok/{id}")
    public Result paymentInfo_ok(@PathVariable("id") Integer id);

    /**
     * 延迟方法
     * @param id
     * @return
     */
    @GetMapping("/hystrix-test/hystrix/timeout/{id}")
    public Result paymentInfo_timeout(@PathVariable("id") Integer id);
}
