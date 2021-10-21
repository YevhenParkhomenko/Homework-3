package com.yevhen_parkhomenko.triangles;

public class Triangle {
    protected double a, b, c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void setABC(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double perimeterCalculator(){
        return a+b+c;
    }

    public double squareCalculator() {
        double p = (a+b+c)/2;
        return Math.sqrt((p * (p - a) * (p - b) * (p - c)));
    }

    public double calculateAngleA(){
        return Math.toDegrees(Math.acos((b*b + c*c - a*a) / (2*b*c)));
    }

    public double calculateAngleB(){
        return Math.toDegrees(Math.acos((a*a + c*c - b*b) / (2*a*c)));
    }

    public double calculateAngleC(){
        return Math.toDegrees(Math.acos((b*b + a*a - c*c) / (2*b*a)));
    }
}