package com.taiji.cloudopen.service;

import com.taiji.cloudopen.common.Result;
import com.taiji.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(value = "CLOUD-PROVIDER-SERVICE")
public interface UserClientService {

    @GetMapping("/cloud/user/findUserById/{id}")
    public Result<User> findUserById(@PathVariable("id") int id);

}
