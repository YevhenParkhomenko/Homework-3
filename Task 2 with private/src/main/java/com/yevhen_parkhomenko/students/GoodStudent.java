package com.yevhen_parkhomenko.students;

public class GoodStudent extends Student {

    public GoodStudent(String name) {
        super(name, " good");
    }

    @Override
    public void study() {
        read();
        write();
        read();
        write();
        relax();
    }
}
