package stepic.method;

import java.util.Scanner;

public class SimpleRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int kol = simpleInRange(a, b);
        System.out.println(kol);
    }

    static int simpleInRange(int a, int b) {
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        int simple = 0;

        for (int i = min; i <= max; i++) {
            int counter = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) counter++;
            }
            if (counter == 2) simple++;
        }
        return simple;
    }
}
