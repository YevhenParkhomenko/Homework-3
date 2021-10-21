package com.yevhen_parkhomenko;

import com.yevhen_parkhomenko.triangles.EquilateralTriangle;
import com.yevhen_parkhomenko.triangles.Triangle;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    private JButton button_msg;
    private JPanel panelMain;

    public App() {
        button_msg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Triangle triangle = new Triangle(6, 8, 10);
                JOptionPane.showMessageDialog(null, "Random triangle related stuff: \n" + triangle.perimeterCalculator() + "\n"
                        +triangle.squareCalculator()+"\n"+triangle.calculateAngleA()+"\n"+triangle.calculateAngleB()+"\n"+triangle.calculateAngleC()+"\n");
                EquilateralTriangle equilateralTriangle = new EquilateralTriangle(1);
                JOptionPane.showMessageDialog(null, "Equilateral triangle related stuff: \n"+equilateralTriangle.perimeterCalculator() + "\n"
                        +equilateralTriangle.squareCalculator()+"\n"+equilateralTriangle.angleCalculator()+"\n");
                triangle.setA(5);
                triangle.setB(11);
                triangle.setC(14);
                JOptionPane.showMessageDialog(null, "New random triangle related stuff: \n"+ triangle.perimeterCalculator() + "\n"
                        +triangle.squareCalculator()+"\n"+triangle.calculateAngleA()+"\n"+triangle.calculateAngleB()+"\n"+triangle.calculateAngleC()+"\n");
                triangle.setABC(12,5, 13);
                JOptionPane.showMessageDialog(null, "New new random triangle related stuff: \n"+ triangle.perimeterCalculator() + "\n"
                        +triangle.squareCalculator()+"\n"+triangle.calculateAngleA()+"\n"+triangle.calculateAngleB()+"\n"+triangle.calculateAngleC()+"\n");
;            }
        });
    }
    public static void main(String[] args) {

        JFrame frame = new JFrame("App");
        frame.setContentPane(new App().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
