package com.yevhen_parkhomenko.triangles;

public class EquilateralTriangle extends Triangle {
    private double square;

    public EquilateralTriangle(double a) {
        super(a, a, a);
    }

    public double angleCalculator(){
        return 60;
    }

    public double perimeterCalculator(){
        return 3*a;
    }

    public double squareCalculator(){
        return Math.sqrt(3)*a*a/4;
    }
}