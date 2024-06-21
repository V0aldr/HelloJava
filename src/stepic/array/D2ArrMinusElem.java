package stepic.array;

import java.util.Random;
import java.util.Scanner;

public class D2ArrMinusElem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] list = new int[scan.nextInt()][scan.nextInt()];
        Random rand = new Random(scan.nextInt());

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                list[i][j] = rand.nextInt(-10, 11);
                System.out.print(list[i][j] + "\t");
            }
            System.out.println();
        }
        for (int i = 0; i < list.length; i++) {
            int counter = list[i].length;
            for (int j = 0; j < list[i].length; j++) {
                if (list[i][j] < 0){
                    counter--;
                    System.out.println(j);
                    break;
                }
            }
            if (counter == list[i].length) System.out.println("NO");
        }
    }
}

//4