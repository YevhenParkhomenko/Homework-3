package com.yevhen_parkhomenko.triangles;

public abstract class Triangle {

    protected double a, b, angle;

    public Triangle(double a, double b, double angle) {
        this.a = a;
        this.b = b;
        this.angle = angle;
    }

    public abstract double perimeterCalculator();
    public abstract double squareCalculator();
}
