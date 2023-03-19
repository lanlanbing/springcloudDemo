package com.dzbtest.feign;

import com.dzbtest.entity.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

// value声明映射的服务提供者的注册名称
@FeignClient(value = "provider")
public interface HystrixProviderClient {
    @GetMapping("/student/findAll")
    Collection<Student> findAll();
    @GetMapping("/student/index")
    String index();
}
