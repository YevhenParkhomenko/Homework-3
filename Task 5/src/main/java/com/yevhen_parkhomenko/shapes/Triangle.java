package com.yevhen_parkhomenko.shapes;

public class Triangle extends Shape{
    private double a, b, c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
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
