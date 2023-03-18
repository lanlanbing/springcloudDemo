package com.dzbtest.controller;

import com.dzbtest.entity.Student;
import com.dzbtest.server.StudentServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/student")
public class StudentHandler {
    // 从springIOC中获取bean对象
    @Autowired
    private StudentServer studentServer;

    // 服务启动时，获取application.yml中配置的端口号
    @Value("${server.port}")
    private String port;

    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return studentServer.findAll();
    }

    @GetMapping("/findById/{id}")
    // @PathVariable("值") 映射 @GetMapping("/findById/{值}")
    public Student findById(@PathVariable("id") long id){
        return studentServer.findById(id);
    }

    @PostMapping("/add")
    public String add(@RequestBody Student student){
        return studentServer.add(student);
    }

    @PutMapping("/update")
    public String update(@RequestBody Student student){
        return studentServer.update(student);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteById(@PathVariable("id") long id){
        return studentServer.deleteById(id);
    }

    @GetMapping("/index")
    public String index(){
        return "当前端口"+this.port;
    }
}
