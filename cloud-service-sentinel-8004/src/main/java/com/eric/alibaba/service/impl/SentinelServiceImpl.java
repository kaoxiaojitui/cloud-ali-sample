package com.eric.alibaba.service.impl;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.eric.alibaba.service.SentinelService;
import org.springframework.stereotype.Service;

/**
 * @author eric.li
 * @date 2020/3/26
 */
@Service
public class SentinelServiceImpl implements SentinelService {

    @Override
    @SentinelResource(value = "sayHello")
    public String sayHello() {
        return "hello";
    }
}
