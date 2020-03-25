package com.eric.alibaba.contorller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author eric.li
 * @date 2020/3/24
 */
@RestController
public class ProviderController {
    @Value("${server.port}")
    private String port;

    @GetMapping(value = "/provider")
    public String getProvider(){
        return port;
    }
}
