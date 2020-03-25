package com.eric.alibaba.contorller;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author eric.li
 * @date 2020/3/24
 */
@RestController
@RefreshScope
public class ProviderController {
    @Value("${server.port}")
    private String port;

    @GetMapping(value = "/provider")
    public String getProvider(){
        return port;
    }

    @Value("${config.addr}")
    private String addr;
    @GetMapping(value = "/config")
    public String getConfig(){
        return addr;
    }
}
