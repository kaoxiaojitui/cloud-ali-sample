package com.eric.alibaba.controller;

import com.eric.alibaba.service.SentinelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author eric.li
 * @date 2020/3/26
 */
@RestController
public class SentinelController {
    @Autowired
    private SentinelService sentinelService;

    @GetMapping(value = "/hello")
    public String hello(){
        return sentinelService.sayHello();
    }
}
