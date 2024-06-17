package stepic;

import java.util.Scanner;

public class NestedTriangleStar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int height = scan.nextInt();

        if (height <= 0) {
            System.out.println("ERROR");
            return;
        }

        for (int i = height; i >= 0; i--) {
            for (int j = height; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}





