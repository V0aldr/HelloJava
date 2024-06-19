package stepic.method;

import java.util.Locale;
import java.util.Scanner;

public class ReloadAveradge {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        double x = scan.nextDouble();
        double y = scan.nextDouble();
        double z = scan.nextDouble();
        System.out.printf("%.2f %.2f\n", average(a, b), average(a, b, c));
        System.out.printf("%.2f %.2f\n", average(x, y),average(x, y, z));
    }

    static double average(double num1, double num2){
        return (num1 + num2) / 2;
    }

    static double average(double num1, double num2, double num3){
        return (num1 + num2 + num3) / 3;
    }
}

//3 4 8
//7.2 0.3 4.8

//3.50 5.00
//3.75 4.10