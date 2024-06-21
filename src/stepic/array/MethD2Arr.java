package stepic.array;

import java.util.Random;
import java.util.Scanner;

public class MethD2Arr {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] mas = new int[scan.nextInt()][scan.nextInt()];
        long seed = scan.nextLong();
        initArray(mas, seed);
        printArray(mas);
        System.out.println();
        printMaxIndex(mas);
    }

    static void initArray(int[][] array, long seed) {
        Random rand = new Random(seed);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = rand.nextInt(0, 11);
            }
        }
    }

    static void printArray(int[][] array) {
        for (int[] list : array) {
            for (int element : list) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }
    }

    static int findMax(int[] array) {
        int imax = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > array[imax]) imax = i;
        }
        return imax;
    }

    static void printMaxIndex(int[][] array) {
        for (int[] row : array) {
            int imax = findMax(row);
            System.out.print(imax + " ");
        }
    }
}
//3 4 88