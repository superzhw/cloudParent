package com.taiji.hystrixfeign.service.impl;

import com.taiji.hystrixfeign.common.Result;
import com.taiji.hystrixfeign.service.FeignClientService;
import org.springframework.stereotype.Component;

@Component
public class FeignClientServiceImpl implements FeignClientService {
    @Override
    public Result paymentInfo_ok(Integer id) {
        return new Result(444,"超时","");
    }

    @Override
    public Result paymentInfo_timeout(Integer id) {
        return new Result(444,"超时","");
    }
}
