package stepic.array;

import java.util.Random;
import java.util.Scanner;

public class D2Array {
    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);
        int[][] list = new int[scan.nextInt()][scan.nextInt()];
        Random rand = new Random(scan.nextInt());

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                list[i][j] = rand.nextInt(-5, 5);
                System.out.print(list[i][j] + "\t");
            }
            System.out.println("\t");
        }

        int max = list[0][0], counter = 0;
        for (int[] ints : list) {
            for (int anInt : ints) {
                if (anInt > max) {
                    counter = 0;
                    max = anInt;
                }
                if (anInt == max) counter++;
            }
        }
        System.out.println(max + " " + counter);
    }
}
//