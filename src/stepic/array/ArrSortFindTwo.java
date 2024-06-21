package stepic.array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrSortFindTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] list = new int[scan.nextInt()];
        Random rand = new Random(scan.nextInt());

        for (int i = 0; i < list.length ; i++) {
            list[i] = rand.nextInt(10 ,21);
        }

        System.out.println(Arrays.toString(list));
        Arrays.sort(list, scan.nextInt(), scan.nextInt());
        System.out.println(Arrays.toString(list));
    }
}
//