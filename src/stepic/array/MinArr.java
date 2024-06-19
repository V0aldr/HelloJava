package stepic.array;

import java.util.Scanner;

public class MinArr {
    public static void main(String [] args){
        Scanner scan =new Scanner(System.in);
        int range = scan.nextInt();

        int [] list = new int[range];
        int min = 0;
        for (int i = 0; i < list.length; i++) {
            int number = scan.nextInt();
            list[i] = number;
            if (list[i] <= list[0]) min = i;
        }
        System.out.println();
        list[min] = -1;
        for (int el:list) System.out.print(el +" ");
    }
}


//8
//2 11 2 15 6 2 20 7