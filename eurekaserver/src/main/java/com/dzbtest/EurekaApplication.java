package com.dzbtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

// 声明该类是spring boot服务的入口
@SpringBootApplication
// 声明该类是一个Eureka Server微服务，提供服务注册和服务发现功能，即注册中心
@EnableEurekaServer
public class EurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class,args);
    }
}
