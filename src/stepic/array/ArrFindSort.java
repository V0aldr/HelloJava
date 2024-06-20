package stepic.array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrFindSort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] list = new double[scan.nextInt()];
        int seed = scan.nextInt();
        Random rand = new Random(seed);

        for (int i = 0; i < list.length; i++) {
            list[i] = rand.nextDouble(0, 2);
        }

        double mini = list[0], maxi = list[0];
        for (int i = 1; i < list.length; i++) {
            if (list[i] < mini) mini = list[i];
            if (list[i] > maxi) maxi = list[i];
        }

        System.out.println(Arrays.toString(list));
        System.out.println(mini + maxi);
    }
}
