package stepic.method;

import java.util.Scanner;

public class DelitelvseChisla {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        printDivider(number);
    }

    static void printDivider(int number){
        for (int i = 1; i < number; i++) {
            if (number % i == 0) System.out.print(i + " ");
        }
    }
}


//246 	1 2 3 6 41 82 123 246