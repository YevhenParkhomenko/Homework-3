package com.yevhen_parkhomenko;

import com.yevhen_parkhomenko.shapes.*;

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
                Shape triangle = new Triangle(1,1,1);
                JOptionPane.showMessageDialog(null, "Triangle related stuff: \n"
                +triangle.perimeterCalculator()+"\n"+triangle.squareCalculator()+"\n");
                Shape circle = new Circle(1);
                JOptionPane.showMessageDialog(null,"Circle related stuff: \n"
                +circle.perimeterCalculator()+"\n"+circle.squareCalculator()+"\n");
                Shape rectangle = new Rectangular(1, 2);
                JOptionPane.showMessageDialog(null,"Rectangle related stuff: \n"
                +rectangle.perimeterCalculator()+"\n"+rectangle.squareCalculator()+"\n");
                Shape square = new Square(1);
                JOptionPane.showMessageDialog(null,"Square related stuff: \n"
                +square.perimeterCalculator()+"\n"+square.squareCalculator()+"\n");
                Shape rhombus = new Rhombus(2,3);
                JOptionPane.showMessageDialog(null,"Rhombus related stuff: \n"
                +rhombus.perimeterCalculator()+"\n"+rhombus.squareCalculator()+"\n");
            }
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
