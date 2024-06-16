package GUI;

import javax.swing.*;
import java.awt.*;

public class SimpleCalculatorGrid {
    public static void main(String[] args) {
        JPanel window = new JPanel();

        GridLayout gridLayout = new GridLayout(4, 2, 5, 5);
        window.setLayout(gridLayout);

        JLabel label1 = new JLabel("Number 1: ", SwingConstants.CENTER);
        JTextField field1 = new JTextField(10);
        JLabel label2 = new JLabel("Number 2: ", SwingConstants.CENTER);
        JTextField field2 = new JTextField(10);
        JLabel label3 = new JLabel("SUM", SwingConstants.CENTER);
        JTextField field3 = new JTextField(10);
        JButton go = new JButton("Add");

        BorderLayout bl = new BorderLayout();





        window.add(label1);
        window.add(field1);
        window.add(label2);
        window.add(field2);
        window.add(label3);
        window.add(field3);
        window.add(go);

        JFrame frame = new JFrame("CalculatorGrid");
        frame.setContentPane(window);
        frame.setSize(400, 200);
        frame.setVisible(true);

    }
}
