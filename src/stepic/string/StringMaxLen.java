package stepic.string;

import java.util.Scanner;

public class StringMaxLen {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = "   Свиристелки прилетели     и    запели в унисон   ";
        System.out.println(getFirstWord(str));
    }


    static String getFirstWord(String string) {
        String[] words = string.split(" ");
        int maxLen = 0;
        String aWord = "";
        for (String word : words) {
            if (word.length() > maxLen) {
                aWord = word;
                maxLen = aWord.length();
            }
        }
        aWord = aWord.trim();
        return aWord;
    }
}
