package com.yevhen_parkhomenko.students;

public abstract class Student {
    protected String name, state;

    public Student(String name) {
        this.name = name;
        this.state = "";
    }

    public void relax(){
        state += " Relax";
    }

    public void read(){
        state += " Read";
    }

    public void write(){
        state += " Write";
    }

    public abstract void study();

    public void getInfo(){
        System.out.println(name);
    }

    public void getFullInfo(){
        System.out.println(name + " " + state);
    }
}