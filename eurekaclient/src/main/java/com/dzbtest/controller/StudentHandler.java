package com.dzbtest.controller;

import com.dzbtest.entity.Student;
import com.dzbtest.server.StudentServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/student")
public class StudentHandler {
    @Autowired
    private StudentServer studentServer;

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
    public String add(Student student){
        return studentServer.add(student);
    }

    @PutMapping("/update")
    public String update(Student student){
        return studentServer.update(student);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteById(@PathVariable("id") long id){
        return studentServer.deleteById(id);
    }

}
