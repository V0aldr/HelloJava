package Syntaxis;

import java.util.Scanner;

public class ProductWhile {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();

        int min = Math.min(number1, number2);
        int max = Math.max(number1, number2);

        double product = 1;
        while (min <= max){
            product *= min;
            min ++;
        }

        System.out.println(product);
    }
}
