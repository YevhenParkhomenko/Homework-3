package com.yevhen_parkhomenko.triangles;

public class IsoscelesTriangle extends Triangle {

    private double sinHalfAngle = Math.sin(Math.toRadians(angle/2));

    public IsoscelesTriangle(double a, double b, double angle) {
        super(a, b, angle);
    }

    @Override
    public double perimeterCalculator() {
        if (a==b) return 2*a*(1+sinHalfAngle);
        else if (a == 2*sinHalfAngle*b) return 2*b+a;
        else return 2*a+b;
    }

    @Override
    public double squareCalculator() {
        if (a==b){
            double c = Math.sqrt(a*a+b*b-2*a*b*Math.cos(Math.toRadians(angle)));
            double h = 0.5*c*Math.sqrt(a*a-0.25*c*c);
            return c*h;
        }
        else if (a == 2*sinHalfAngle*b) return 0.5*b*Math.sqrt(a*a-0.25*b*b);
        else return 0.5*a*Math.sqrt(b*b-0.25*a*a);
    }
}
