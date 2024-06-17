package stepic;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int range = scan.nextInt();
        int counter = 0;
        int number;

        do {
            number = scan.nextInt();
            if (number < 0) break;
            if (range % number == 0) counter ++;
        }while (number > 0);

        scan.close();
        System.out.println(counter);

    }
}





//78
//5 6 4 1 26 28 -5
//
//Sample Output:
//
//3
//17
//2 3 4 9 -1