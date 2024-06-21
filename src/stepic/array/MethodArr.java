package stepic.array;

import java.util.Random;
import java.util.Scanner;

public class MethodArr {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int[] ar = new int[scan.nextInt()];
        long seed = scan.nextLong();
        init(ar, seed);
        print(ar);
        int ind = findMax(ar);
        System.out.println(ind);

    }

    public static void init(int[] array, long seed){
        Random rand = new Random(seed);
        
    }

    public static void print(){}

    public static void findMax(){}

}
