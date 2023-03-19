package com.dzbtest.controller;

import com.dzbtest.entity.Student;
import com.dzbtest.feign.HystrixProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("hystrix")
public class HystrixHandler {
    @Autowired
    private HystrixProviderClient hystrixProviderClient;

    @GetMapping("findAll")
    public Collection<Student> findAll(){
        return hystrixProviderClient.findAll();
    }

    @GetMapping("index")
    public String index(){
        return hystrixProviderClient.index();
    }
}
