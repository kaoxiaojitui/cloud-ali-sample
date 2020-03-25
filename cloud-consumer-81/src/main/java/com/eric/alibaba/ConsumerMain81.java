package com.eric.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author eric.li
 * @date 2020/3/24
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ConsumerMain81 {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerMain81.class, args);
    }
}
