package com.yevhen_parkhomenko.shapes;

public class Square extends Shape {
    private double a;

    public Square(double a) {
        this.a = a;
    }

    @Override
    public double perimeterCalculator() {
        return 4*a;
    }

    @Override
    public double squareCalculator() {
        return a*a;
    }
}
