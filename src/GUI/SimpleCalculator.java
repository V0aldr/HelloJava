package GUI;

import javax.swing.*;
import java.awt.FlowLayout;


public class SimpleCalculator {
    public static void main(String[] args) {
        // Создаём панель
        JPanel windowContent = new JPanel();

        // Задаём менеджер отображения для этой панели
        FlowLayout flowLayout = new FlowLayout();
        windowContent.setLayout(flowLayout);

        // Создаём компоненты в памяти
        JLabel text1 = new JLabel("Number 1: ");
        JTextField field1 = new JTextField(10);
        JLabel text2 = new JLabel("Number 2: ");
        JTextField field2 = new JTextField(10);
        JLabel text3 = new JLabel("SUM");
        JTextField field3 = new JTextField(10);
        JButton go = new JButton("Add");

        // Добавляем компоненты на панель
        windowContent.add(text1);
        windowContent.add(field1);
        windowContent.add(text2);
        windowContent.add(field2);
        windowContent.add(text3);
        windowContent.add(field3);
        windowContent.add(go);

        // Создаём фрейм и задаём для него панель
        JFrame frame = new JFrame("First Calculator");
        frame.setContentPane(windowContent);

        // задаём и размер и делаем фрейм видимым
        frame.setSize(400, 100);
        frame.setVisible(true);


    }
}
