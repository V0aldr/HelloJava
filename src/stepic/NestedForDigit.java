package stepic;

import java.util.Scanner;

public class NestedForDigit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int range = 5;

        for (int i = range; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}