package stepic.array;

import java.util.Random;
import java.util.Scanner;

public class MethodArrCut {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] ar = new int[scan.nextInt()];
        long seed = scan.nextLong();
        init(ar, seed);
        print(ar);
        int[] b = reduceAfterMax(ar);
        print(b);
    }

    static void init(int[] array, long seed) {
        Random rand = new Random(seed);
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(-3, 6);
        }
    }

    static void print(int[] array) {
        for (int numb : array) {
            System.out.print(numb + " ");
        }
        System.out.println();
    }

    static int findMax(int[] array) {
        int imax = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[imax]) imax = i;
        }
        return imax;
    }

    static int[] reduceAfterMax(int[] array) {
        int[] newArray = new int[findMax(array) + 1];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }

}

//10 99