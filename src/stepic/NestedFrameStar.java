package stepic;

import java.util.Scanner;

public class NestedFrameStar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int height = scan.nextInt();
        int width = scan.nextInt();

        if (height < 0 || width < 0) {
            System.out.println("ERROR");
            return;
        }

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (i == 0 | i == height - 1) {
                    System.out.print("*");
                } else if (j == 0 | j == width - 1) {
                    System.out.print("*");
                } else System.out.print(" ");
            }
            System.out.println();
        }
    }
}


//5 4
//
//****
//*  *
//*  *
//*  *
//****