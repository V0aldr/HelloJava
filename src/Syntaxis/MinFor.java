package Syntaxis;

import java.util.Scanner;

public class MinFor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int range = scan.nextInt();

        int min = scan.nextInt();
        for (int i = 0; i < range - 1; i++) {
            int number = scan.nextInt();
            if (number < min) min = number;
        }

        scan.close();
        System.out.println(min);
    }
}


