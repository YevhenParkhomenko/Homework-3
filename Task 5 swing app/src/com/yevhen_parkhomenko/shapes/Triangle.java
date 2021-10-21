package com.yevhen_parkhomenko.shapes;

public class Triangle extends Shape{
    private double a, b, c;

    public Triangle(double a, double b, double c) {
        if (a!=0 && b!=0 && c!=0 && (a + b >= c) && (b + c >= a) && (c + a >= b)) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
        else {
            System.out.println("These numbers don't set a triangle");
        }
    }

    @Override
    public double perimeterCalculator() {
        return a+b+c;
    }

    @Override
    public double squareCalculator() {
        double p = (a+b+c)/2;
        return Math.sqrt((p * (p - a) * (p - b) * (p - c)));
    }
}