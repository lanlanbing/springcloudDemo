package com.dzbtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class RibbonApplication {
    public static void main(String[] args) {
        SpringApplication.run(RibbonApplication.class,args);
    }

    @Bean
    // 该注解实现负载均衡（声明一个基于ribbon的负载均衡）
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
