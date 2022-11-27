package com.wen.wenmall.ware;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class WenmallWareApplication {

    public static void main(String[] args) {
        SpringApplication.run(WenmallWareApplication.class, args);
    }

}
