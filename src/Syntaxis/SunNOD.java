package Syntaxis;

import java.util.Scanner;

public class SunNOD {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number1 = scan.nextInt();
        int number2 = scan.nextInt();
        scan.close();

        int sum = 0;

        for (int i = number1; i <= number2; i++) {
            if (i <= 1) continue;
            for (int j = 2; j <= i; j++) {
                if (i % j == 0) {
                    sum += j;
                    break;
                }
            }
        }
        System.out.println(sum);
    }
}

