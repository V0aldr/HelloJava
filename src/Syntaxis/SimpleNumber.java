package Syntaxis;

import java.util.Scanner;

public class SimpleNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = scan.nextInt();
        String output = "NO";

        if (number <= 1) {
            System.out.println(output);
            return;

        } else {
            for (int i = 2; i < number - 1; i++) {
                if (number % i == 0) {
                    output = "NO";
                    break;
                }else output = "YES";

            }
        }
        System.out.println(output);
    }
}

