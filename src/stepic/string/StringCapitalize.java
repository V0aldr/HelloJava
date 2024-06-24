package stepic.string;

import java.util.Arrays;
import java.util.Scanner;

public class StringCapitalize {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine().strip();
        String[] words = sentence.split(" +");
        System.out.println(Arrays.toString(words));
        String result = "";
        for (int i = 0; i < words.length; i++) {
            String first = words[i].substring(0, 1).toUpperCase();
            String last = words[i].substring(1);
            result += (first + last + " ");
        }
        result = result.trim();
        System.out.println(result);

    }
}

