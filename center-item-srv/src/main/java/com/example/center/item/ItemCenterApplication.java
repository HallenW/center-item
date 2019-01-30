package com.example.center.item;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author silun.wang
 * @date 2019/1/29
 */
@SpringBootApplication
@EnableEurekaClient
public class ItemCenterApplication {
    public static void main(String[] args) {
        SpringApplication.run( ItemCenterApplication.class, args );
    }
}
