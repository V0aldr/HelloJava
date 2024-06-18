package stepic;

import java.util.Scanner;

public class NestedTriangleBackStar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int height = 7;

        if (height <= 0) {
            System.out.println("ERROR");
            return;

        } else {

            for (int i = height; i >= 0; i -= 2) {
                for (int j = height - 1; j >= i; j -= 2) {
                    System.out.print("_");
                }
                for (int k = 0; k < i; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
