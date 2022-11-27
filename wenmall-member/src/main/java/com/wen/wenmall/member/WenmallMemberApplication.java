package com.wen.wenmall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.wen.wenmall.member.feign")
@SpringBootApplication
public class WenmallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(WenmallMemberApplication.class, args);
    }

}
