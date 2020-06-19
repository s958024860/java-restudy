package com.songfz.collection_map;

import java.util.HashSet;
import java.util.Set;

/**
 * 学生类
 */
public class Student {

    public String id;

    public String name;

    public Set course;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
        this.course = new HashSet();
    }
}
