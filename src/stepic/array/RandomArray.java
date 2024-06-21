package stepic.array;

import java.util.Random;
import java.util.Scanner;

public class RandomArray {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int range = scan.nextInt();
        int seed = scan.nextInt();

        Random rand = new Random(seed);

        int[] list = new int[range];
        int sum = 0;
        double product = 1;
        for (int i = 0; i < list.length; i++) {
            list[i] = rand.nextInt(-5, 6);
            if (list[i] >= 0) {
                sum += list[i];
            } else product *= list[i];
        }

        for (int el : list) System.out.print(el + " ");
        System.out.println();
        System.out.printf("%2d %.1f", sum, product);
    }
}
//