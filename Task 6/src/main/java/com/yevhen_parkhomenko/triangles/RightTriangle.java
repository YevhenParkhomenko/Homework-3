package com.yevhen_parkhomenko.triangles;

public class RightTriangle extends Triangle{

    public RightTriangle(double a, double b, double angle) {
        super(a, b, angle);
    }

    @Override
    public double perimeterCalculator() {
        if (angle == 90) return a+b+Math.sqrt(a*a+b*b);
        else if (a>b) return a+b+Math.sqrt(a*a-b*b);
        else return a+b+Math.sqrt(b*b-a*a);
    }

    @Override
    public double squareCalculator() {
        if (angle == 90) return a*b/2;
        else if (a>b) return Math.sqrt(a*a-b*b)*b*0.5;
        else return Math.sqrt(b*b-a*a)*a*0.5;
    }
}
