package Syntaxis;

import java.util.Scanner;

public class SimpleNumRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number1 = scan.nextInt();
        int number2 = scan.nextInt();
        scan.close();

        for (int i = number1; i <= number2; i++) {
            int counter = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) counter++;
            }

            if (counter == 2) System.out.print(i + " ");

        }
        System.out.println();
    }
}


//1 12 	>>> 2 3 5 7 11