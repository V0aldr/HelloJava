package stepic;

import java.util.Scanner;

public class FirstSimpleNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number1 = scan.nextInt();
        int number2 = scan.nextInt();
        scan.close();

        int min = Math.min(number1, number2);
        int max = Math.max(number1, number2);

        boolean flag = true;

        BLOCK:
        for (int i = min; i <= max; i++) {
            if (i <= 1) {
                flag = true;
                continue;
            }
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    System.out.print(i);
                    break BLOCK;
                }

            }

        }
        if (flag) System.out.println("NO");
    }
}
