package com.wen.wenmall.product;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class WenmallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(WenmallProductApplication.class, args);
    }

}
