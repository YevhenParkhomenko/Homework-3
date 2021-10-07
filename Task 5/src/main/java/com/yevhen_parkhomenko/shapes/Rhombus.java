package com.yevhen_parkhomenko.shapes;

public class Rhombus extends Shape {
    private double a, h;

    public Rhombus(double a, double h) {
        this.a = a;
        this.h = h;
    }

    @Override
    public double perimeterCalculator() {
        return 4*a;
    }

    @Override
    public double squareCalculator() {
        return a*h;
    }
}
