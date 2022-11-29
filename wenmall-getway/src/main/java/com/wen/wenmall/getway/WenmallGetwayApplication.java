package com.wen.wenmall.getway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/*
1,开启网关服务的注册与发现
(配置服务的注册中心地址)
 */
@EnableDiscoveryClient
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class WenmallGetwayApplication {

    public static void main(String[] args) {
        SpringApplication.run(WenmallGetwayApplication.class, args);
    }

}
