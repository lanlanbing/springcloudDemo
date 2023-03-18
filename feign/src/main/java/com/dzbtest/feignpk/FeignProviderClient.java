package com.dzbtest.feignpk;

import com.dzbtest.entity.Student;
import com.dzbtest.feignpk.impl.FeignProviderClientImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;
// value声明映射的服务提供者的注册名称;fallback（降级处理，服务调用出错后，界面展示接口实现类的容错处理）
@FeignClient(value = "provider",fallback = FeignProviderClientImpl.class)
public interface FeignProviderClient {
    @GetMapping("/student/findAll")
    Collection<Student> findAll();
    @GetMapping("/student/index")
    String index();
}
