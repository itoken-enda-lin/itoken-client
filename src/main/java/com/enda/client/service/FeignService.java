package com.enda.client.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "itoken-server", fallback = FeignServiceHystrix.class)
public interface FeignService {

    @GetMapping("sayHello")
    String sayHello();
}
