package com.dzbtest.feignpk.impl;

import com.dzbtest.entity.Student;
import com.dzbtest.feignpk.FeignProviderClient;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class FeignProviderClientImpl implements FeignProviderClient {
    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public String index() {
        return "服务运维中................";
    }
}
