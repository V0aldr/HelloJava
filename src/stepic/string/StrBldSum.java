package stepic.string;

import java.util.Scanner;

public class StrBldSum {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        String str = primer(a, b);
        System.out.println(str);
    }

    static String primer ( int number1, int number2){
        StringBuilder sb = new StringBuilder(number1 + " + " + number2 + " = " + (number1 + number2));
        return sb.toString();
    }

}
