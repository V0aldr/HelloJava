package GUI;

import javax.swing.*;
import java.awt.GridLayout;
import java.awt.BorderLayout;

public class Calculator {
    // Объявление всех компонентов калькулятора.
    JPanel windowContent;
    JTextField displayText;
    JButton btn0;
    JButton btn1;
    JButton btn2;
    JButton btn3;
    JButton btn4;
    JButton btn5;
    JButton btn6;
    JButton btn7;
    JButton btn8;
    JButton btn9;
    JButton buttonPoint;
    JButton buttonEqual;
    JPanel pl;

    // В конструкторе создаются все компоненты
    // и добавляются на фрейм с помощью комбинации
    // Borderlayout и Gridlayout
    Calculator() {
        windowContent = new JPanel();
        // Задаём схему для этой панели
        BorderLayout bl = new BorderLayout();
        windowContent.setLayout(bl);

        // Создаём и отображаем поле
        // Добавляем его в Северную область окна
        displayText = new JTextField(30);
        windowContent.add("North", displayText);

        // Создаём кнопки, используя конструктор
        // класса JButton, который принимает текст
        // кнопки в качестве параметра
        btn0 = new JButton("0");
        btn1 = new JButton("1");
        btn2 = new JButton("2");
        btn3 = new JButton("3");
        btn4 = new JButton("4");
        btn5 = new JButton("5");
        btn6 = new JButton("6");
        btn7 = new JButton("7");
        btn8 = new JButton("8");
        btn9 = new JButton("9");
        buttonPoint = new JButton(".");
        buttonEqual = new JButton("=");

        // Создаём панель с GridLayout
        // которая содержит 12 кнопок - 10 кнопок с числами
        // и кнопки с точкой и знаком равно
        pl = new JPanel();
        GridLayout gl = new GridLayout(4, 3);
        pl.setLayout(gl);

        //Добавляем кнопки на панель p1
        pl.add(btn0);
        pl.add(btn1);
        pl.add(btn2);
        pl.add(btn3);
        pl.add(btn4);
        pl.add(btn5);
        pl.add(btn6);
        pl.add(btn7);
        pl.add(btn8);
        pl.add(btn9);
        pl.add(buttonPoint);
        pl.add(buttonEqual);

        // Помещаем панель p1 в центральную область окна
        windowContent.add("Center", pl);

        //Создаём фрейм и задаём его основную панель
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(windowContent);

        // делаем размер окна достаточным
        // для того, чтобы вместить все компоненты
        frame.pack();

        // Наконец, отображаем окно
        frame.setVisible(true);
    }

    public static void main(String [] args){
        Calculator calculator = new Calculator();
    }

}
