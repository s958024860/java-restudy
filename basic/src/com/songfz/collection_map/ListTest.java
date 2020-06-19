package com.songfz.collection_map;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

    /**
     * 用于存放备选课程的list
     */
    public List coursesToSelect;

    public ListTest() {
        this.coursesToSelect = new ArrayList();
    }

    public void testAdd() {
        Course course1 = new Course("1", "数据结构");
        coursesToSelect.add(course1);
        System.out.println("添加了课程");
        Course temp = (Course) coursesToSelect.get(0);
        System.out.println("添加了课程: " + temp.id + temp.name);

        Course course2 = new Course("2", "C语言");
        coursesToSelect.add(0, course2);
        Course temp2 = (Course) coursesToSelect.get(0);
        System.out.println("添加了课程: " + temp2.id + temp2.name);
    }

    public static void main(String[] args) {
        ListTest listTest = new ListTest();
        listTest.testAdd();
    }
}
