package stepic.array;

import java.util.Random;
import java.util.Scanner;

public class RandArrAverage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int range = scan.nextInt();
        int seed = scan.nextInt();

        Random rand = new Random(seed);

        double [] list = new double[range];
        double sum = 0;
        for (int i = 0; i < list.length; i++) {
            list[i] = rand.nextDouble(0, 5);
            System.out.printf("%.2f ", list[i]);
            sum += list[i];
        }
        System.out.println();
        double average = sum / list.length;
        System.out.printf("%.2f\n", average);

        for (int i = 0; i < list.length; i++) {
            if (list[i] > average) list[i] = average;
            System.out.printf("%.2f ", list[i]);
        }
        System.out.println();
    }
}

//10