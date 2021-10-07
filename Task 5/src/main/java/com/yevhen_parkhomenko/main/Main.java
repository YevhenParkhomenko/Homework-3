package com.yevhen_parkhomenko.main;

import com.yevhen_parkhomenko.shapes.*;
import com.yevhen_parkhomenko.shapes.Shape;

import java.awt.*;


public class Main {
    public static void main(String[] args) {
        Shape triangle = new Triangle(1,1,1);
        System.out.println("Triangle related stuff: ");
        System.out.println(triangle.perimeterCalculator());
        System.out.println(triangle.squareCalculator());
        Shape circle = new Circle(1);
        System.out.println("Circle related stuff: ");
        System.out.println(circle.perimeterCalculator());
        System.out.println(circle.squareCalculator());
        Shape rectangle = new Rectangular(1, 2);
        System.out.println("Rectangle related stuff: ");
        System.out.println(rectangle.perimeterCalculator());
        System.out.println(rectangle.squareCalculator());
        Shape square = new Square(1);
        System.out.println("Square related stuff: ");
        System.out.println(square.perimeterCalculator());
        System.out.println(square.squareCalculator());
        Shape rhombus = new Rhombus(2,3);
        System.out.println("Rhombus related stuff: ");
        System.out.println(rhombus.perimeterCalculator());
        System.out.println(rhombus.squareCalculator());
    }
}
