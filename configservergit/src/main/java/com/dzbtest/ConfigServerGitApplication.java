package com.dzbtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
// 声明这是个配置中心
@EnableConfigServer
// 注册到注册中心
@EnableEurekaClient
public class ConfigServerGitApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerGitApplication.class,args);
    }
}
