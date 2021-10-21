package com.yevhen_parkhomenko;

import com.yevhen_parkhomenko.triangles.IsoscelesTriangle;
import com.yevhen_parkhomenko.triangles.RightTriangle;
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
                Triangle rightTriangle = new RightTriangle(3, 5, 30);
                JOptionPane.showMessageDialog(null,"Right triangle related stuff: \n"
                +rightTriangle.perimeterCalculator() + "\n" + rightTriangle.squareCalculator() + "\n");

                Triangle isoscelesTriangle = new IsoscelesTriangle(8, 6, 48.189685);
                JOptionPane.showMessageDialog(null, "Isosceles triangle related stuff: \n"
                +isoscelesTriangle.perimeterCalculator() + "\n" + isoscelesTriangle.squareCalculator() + "\n");
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
