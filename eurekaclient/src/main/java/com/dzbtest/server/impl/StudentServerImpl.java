package com.dzbtest.server.impl;

import com.dzbtest.entity.Student;
import com.dzbtest.server.StudentServer;
import org.springframework.stereotype.Repository;

import java.util.*;

// 声明一个 Bean
@Repository
public class StudentServerImpl implements StudentServer {
    private static Map<Long,Student> studentMap;
    static {
        studentMap = new HashMap<>();
        studentMap.put(1L,new Student(1L,"小红",22));
        studentMap.put(2L,new Student(2L,"小明",23));
        studentMap.put(3L,new Student(3L,"小兰",24));
        studentMap.put(4L,new Student(4L,"小黄",20));
    }
    @Override
    public Collection<Student> findAll() {
        return studentMap.values();
    }

    @Override
    public Student findById(long id) {
        return studentMap.get(id);
    }

    @Override
    public String add(Student student) {
        studentMap.put(student.getId(),student);
        return "添加成功！！！";
    }

    @Override
    public String update(Student student) {
        studentMap.put(student.getId(),student);
        return "修改成功！！！";
    }

    @Override
    public String deleteById(long id) {
        studentMap.remove(id);
        return "删除成功！！！";
    }
}
