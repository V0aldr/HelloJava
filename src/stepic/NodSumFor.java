package stepic;

import java.util.Scanner;

public class NodSumFor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int range = scan.nextInt();

        int sum = 0;
        for (int i=1; i<=range; i++){
            if (range % i == 0) sum += i;
        }

        scan.close();
        System.out.println(sum);
    }
}
