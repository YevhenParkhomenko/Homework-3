package com.yevhen_parkhomenko.main;

import com.yevhen_parkhomenko.groups.Group;
import com.yevhen_parkhomenko.students.BadStudent;
import com.yevhen_parkhomenko.students.GoodStudent;
import com.yevhen_parkhomenko.students.Student;

public class Main {
    public static void main(String[] args) {
        Student student1 = new GoodStudent("Grisha Perelman");
        Student student2 = new BadStudent("Perisha Gelman");
        Group group = new Group("MI-76");
        group.addStudent(student1);
        group.addStudent(student2);
        group.getInfo();
        group.getFullInfo();
        student1.study();
        student2.study();
        group.getFullInfo();
    }
}
