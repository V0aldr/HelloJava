package stepic;

import java.util.Scanner;

public class SumEvenNOD {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int number = 2;
        scan.close();

        int sum = 0;

        for (int i = 2; i < number; i += 2) {
            if (number % i == 0) sum += i;
        }
        System.out.println(sum);
    }
}
