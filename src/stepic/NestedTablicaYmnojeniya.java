package stepic;

import java.util.Scanner;

public class NestedTablicaYmnojeniya {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = scan.nextInt();

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number; j++) {
                System.out.print(j * i + "\t");
            }
            System.out.println();
        }
    }
}
