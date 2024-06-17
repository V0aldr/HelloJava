package stepic;

import java.util.Scanner;

public class Mark {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int counter = 0, n = 10;
        while (n > 0) {
            int mark = scan.nextInt();
            if (mark < 4) counter++;
            n--;
        }
        System.out.println(counter);
    }
}
//6 7 3 2 9 5 4 1 7 8