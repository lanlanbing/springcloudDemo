package com.dzbtest.controller;

import com.dzbtest.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

@RestController
@RequestMapping("/consumer")
public class ConsumerHandler {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        // 两种方法调用 getForEntity 与 getForObject
        // return restTemplate.getForEntity("http://localhost:8010/student/findAll",Collection.class).getBody();
        return restTemplate.getForObject("http://localhost:8010/student/findAll",Collection.class);
    }

    @GetMapping("/findById/{id}")
    public Student findById(@PathVariable("id") long id){
        // 两种方法调用 getForEntity 与 getForObject
        // return restTemplate.getForEntity("http://localhost:8010/student/findById/{id}",Student.class,id).getBody();
        return restTemplate.getForObject("http://localhost:8010/student/findById/{id}",Student.class,id);
    }

    @PostMapping("/add")
    public String add(@RequestBody Student student){
        restTemplate.postForObject("http://localhost:8010/student/add",student,String.class);
        return "添加成功！！！";
    }

    @PutMapping("/update")
    public String update(@RequestBody Student student){
        restTemplate.put("http://localhost:8010/student/update",student);
        return "修改成功！！！";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteById(@PathVariable("id") long id){
        restTemplate.delete("http://localhost:8010/student/delete/{id}",id);
        return "删除成功！！！";
    }

}