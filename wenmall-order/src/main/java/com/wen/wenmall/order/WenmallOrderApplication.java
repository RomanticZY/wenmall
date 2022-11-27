package com.wen.wenmall.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class WenmallOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(WenmallOrderApplication.class, args);
    }

}
