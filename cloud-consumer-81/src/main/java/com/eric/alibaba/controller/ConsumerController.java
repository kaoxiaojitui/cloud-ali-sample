package com.eric.alibaba.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author eric.li
 * @date 2020/3/24
 */
@RestController
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = "/consumer")
    public String getProvider(){
        System.out.println("consumer");
        return restTemplate.getForObject("http://provider-service/provider", String.class);
    }

}
