package com.dzbtest.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private long id;        // 数据id
    private String name;    // 名字
    private int age;		// 年龄
}
