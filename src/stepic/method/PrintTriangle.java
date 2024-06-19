package stepic.method;

import java.util.Scanner;

public class PrintTriangle {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
//        int number = scan.nextInt();
//        String str = scan.next();
//        char chr = str.charAt(0);
        printTriangle(4, '$');
    }

    static void printTriangle(int number, char chr) {
        for (int i = 0; i < number; i += 2) {
               for (int j = number; j > i; j-=2) {
                  System.out.print("_");
               }
               for (int k = i; k < number; k++) {
                  System.out.print(chr);
               }
                System.out.println();
            }
    }
}
