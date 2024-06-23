package stepic.string;

import java.util.Arrays;
import java.util.Scanner;

public class StringTrim {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println(delSpace(str));
    }


    static String delSpace(String string) {
        string = string.trim();
        String[] words = string.split(" +");
        String result = "";
        for (String word : words) {
            if (!word.isBlank()) {
                result += word + " ";
            }
        }
        result = result.trim();
        return result;
    }
}

//    Свиристелки прилетели     и    запели в унисон
//
//	Свиристелки