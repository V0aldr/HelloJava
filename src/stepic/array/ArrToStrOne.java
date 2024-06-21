package stepic.array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrToStrOne {
    public static void main(String[] args){
        //Дано
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[scan.nextInt()];
        int seed = scan.nextInt();
        int control = scan.nextInt();
        Random rand = new Random(seed);
        //Решение
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(2, 16);
        }

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int ifind = Arrays.binarySearch(arr, control);
        if (ifind < 0) {
            System.out.println("ERROR");
        }else {
            int[] kopy = Arrays.copyOf(arr, ifind + 1);
            System.out.println(Arrays.toString(kopy));
        }
    }
}
//