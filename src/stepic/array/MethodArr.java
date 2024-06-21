package stepic.array;

import java.util.Random;
import java.util.Scanner;

public class MethodArr {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] ar = new int[scan.nextInt()];
        long seed = scan.nextLong();
        init(ar, seed);
        print(ar);
        int ind = findMax(ar);
        System.out.println(ind);

    }

    public static void init(int[] array, long seed) {
        Random rand = new Random(seed);
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(-3, 6);
        }
    }

    public static void print(int[] array) {
        for (int numbers : array) {
            System.out.print(numbers + " ");
        }
        System.out.println();
    }

    public static int findMax(int[] array) {
        int imax = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > array[imax]) imax = i;
        }
        return imax;
    }
}
