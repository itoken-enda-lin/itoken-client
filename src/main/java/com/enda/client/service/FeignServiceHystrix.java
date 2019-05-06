package com.enda.client.service;

import org.springframework.stereotype.Service;

@Service
public class FeignServiceHystrix implements FeignService {

    @Override
    public String sayHello() {
        return "request error";
    }
}
