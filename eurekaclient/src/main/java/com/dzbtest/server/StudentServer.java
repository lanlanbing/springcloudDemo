package com.dzbtest.server;

import com.dzbtest.entity.Student;

import java.util.Collection;

public interface StudentServer {
    Collection<Student> findAll();
    Student findById(long id);
    String add(Student student);
    String update(Student student);
    String deleteById(long id);
}
