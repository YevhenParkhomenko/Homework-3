package com.yevhen_parkhomenko.main;

import com.yevhen_parkhomenko.triangles.EquilateralTriangle;
import com.yevhen_parkhomenko.triangles.Triangle;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(6, 8, 10);
        EquilateralTriangle equilateralTriangle = new EquilateralTriangle(1);
        System.out.println("Random triangle related stuff: ");
        System.out.println(triangle.calculateAngleA());
        System.out.println(triangle.calculateAngleB());
        System.out.println(triangle.calculateAngleC());
        System.out.println(triangle.perimeterCalculator());
        System.out.println(triangle.squareCalculator());
        System.out.println("Equilateral triangle related stuff: ");
        System.out.println(equilateralTriangle.calculateAngleA());
        System.out.println(equilateralTriangle.calculateAngleB());
        System.out.println(equilateralTriangle.calculateAngleC());
        System.out.println(equilateralTriangle.perimeterCalculator());
        System.out.println(equilateralTriangle.squareCalculator());
        triangle.setA(5);
        triangle.setB(11);
        triangle.setC(14);
        System.out.println("New random triangle related stuff: ");
        System.out.println(triangle.calculateAngleA());
        System.out.println(triangle.calculateAngleB());
        System.out.println(triangle.calculateAngleC());
        System.out.println(triangle.perimeterCalculator());
        System.out.println("New random triangle related stuff: ");
        triangle.setABC(12,5, 13);
        System.out.println(triangle.squareCalculator());
        System.out.println(triangle.perimeterCalculator());
    }
}
