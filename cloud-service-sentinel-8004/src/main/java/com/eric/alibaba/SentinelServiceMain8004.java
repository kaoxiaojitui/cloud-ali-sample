package com.eric.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author eric.li
 * @date 2020/3/26
 */
@SpringBootApplication
@EnableDiscoveryClient
public class SentinelServiceMain8004 {
    public static void main(String[] args) {
        SpringApplication.run(SentinelServiceMain8004.class, args);
    }
}
