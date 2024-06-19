package stepic.method;

import java.util.Scanner;
import java.util.Locale;

public class ReloadFigure {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int num1 = scan.nextInt();
        if (num1 == 1){
            double num2 = scan.nextDouble();
            System.out.printf("%.2f", square(num2));
        }else {
            double num2 = scan.nextDouble();
            double num3 = scan.nextDouble();
            System.out.printf("%.2f", square(num2, num3));
        }
    }

    static double square(double num2){
        return num2 * num2;
    }

    static double square(double num2, double num3){
        return num2 * num3;
    }
}
