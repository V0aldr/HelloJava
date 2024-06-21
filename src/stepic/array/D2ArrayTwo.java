package stepic.array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class D2ArrayTwo {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt(), column = scan.nextInt();
        int[][] list = new int[row][column];
        Random rand = new Random(scan.nextInt());

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                list[i][j] = rand.nextInt(-10, 11);
                System.out.print(list[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < column; i++) {
            int sum = 0;
            for (int j = 0; j < row; j++) {
                if (list[j][i] >= 0) sum += list[j][i];
            }
            System.out.print(sum + " ");
        }
    }
}
//