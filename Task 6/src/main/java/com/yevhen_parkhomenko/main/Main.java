package com.yevhen_parkhomenko.main;

import com.yevhen_parkhomenko.triangles.IsoscelesTriangle;
import com.yevhen_parkhomenko.triangles.RightTriangle;
import com.yevhen_parkhomenko.triangles.Triangle;

public class Main {
    public static void main(String[] args) {
        Triangle rightTriangle = new RightTriangle(3, 5, 30);
        Triangle isoscelesTriangle = new IsoscelesTriangle(8, 6, 48.189685);
        System.out.println("Right triangle related stuff: ");
        System.out.println(rightTriangle.perimeterCalculator());
        System.out.println(rightTriangle.squareCalculator());
        System.out.println("Isosceles triangle related stuff: ");
        System.out.println(isoscelesTriangle.perimeterCalculator());
        System.out.println(isoscelesTriangle.squareCalculator());
    }
}
