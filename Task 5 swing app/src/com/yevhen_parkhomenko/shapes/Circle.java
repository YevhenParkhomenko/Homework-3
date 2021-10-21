package com.yevhen_parkhomenko.shapes;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double perimeterCalculator() {
        return 2 * 3.1415926 * radius;
    }

    @Override
    public double squareCalculator() {
        return 3.1415926*radius*radius;
    }
}
