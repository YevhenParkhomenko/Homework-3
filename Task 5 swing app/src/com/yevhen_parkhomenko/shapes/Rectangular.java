package com.yevhen_parkhomenko.shapes;

public class Rectangular extends Shape{
    private double a, b;

    public Rectangular(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double perimeterCalculator() {
        return (a+b)*2;
    }

    @Override
    public double squareCalculator() {
        return a*b;
    }
}
