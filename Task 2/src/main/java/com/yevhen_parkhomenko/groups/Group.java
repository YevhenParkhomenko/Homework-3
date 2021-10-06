package com.yevhen_parkhomenko.groups;

import com.yevhen_parkhomenko.students.Student;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private String name;

    private List<Student> students = new ArrayList<>(42);

    public Group(String name) {
        this.name = name;
    }

    public void addStudent(Student st){
        this.students.add(st);
    }

    public void getInfo(){
        System.out.println(name);
        for (int i = 0; i < this.students.size(); i++) {
            students.get(i).getInfo();
        }
    }

    public void getFullInfo(){
        System.out.println(name);
        for (int i = 0; i < this.students.size(); i++) {
            students.get(i).getFullInfo();
        }
    }
}
