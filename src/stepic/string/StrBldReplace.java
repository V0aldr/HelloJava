package stepic.string;

import java.util.Arrays;
import java.util.Scanner;

public class StrBldReplace {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] words = scan.nextLine().trim().split(" +");

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            if (words[i].toLowerCase().contains("z")) words[i] = "ERROR";
            sb.append(words[i]).append(" ");
        }
        System.out.print(sb);
    }
}


//    Zmama   zlobno   myla    puzzle  and    ramy
//
//	mama ERROR myla ERROR and ramy