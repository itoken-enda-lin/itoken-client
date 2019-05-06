package com.enda.client.controller;

import com.enda.client.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignClientController {

    @Autowired
    private FeignService feignService;

    @GetMapping("admin")
    public String say() {
        return feignService.sayHello();
    }
}
