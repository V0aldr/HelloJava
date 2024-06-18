package stepic.method;

import java.util.Scanner;

public class MaxNuDivide {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int max = maxNumberDivider(a, b);
        System.out.println(max);
    }

    static int maxNumberDivider(int a, int b){
        int maxDivider = 0, theNumber = 0;

        for (int i = a; i <= b; i++) {
            int counter = 1;
            for (int j = 1; j <= i/2 ; j++) {
                if (i % j == 0) counter++;
            }

            if (counter > maxDivider) {
                maxDivider = counter;
                theNumber = i;
            }
        }
        return theNumber;
    }
}
