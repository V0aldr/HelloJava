package Syntaxis;

import java.util.Scanner;

public class DoWhileCount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Math.abs(scan.nextInt());
        int counter = 0, sum = 0;
        int digit;

        do {
            digit = number % 10;
            sum += digit;
            counter++;
            number /= 10;

        }while (number > 0);

        scan.close();
        System.out.println(counter + " " + sum);
    }
}


//4579 	4 25