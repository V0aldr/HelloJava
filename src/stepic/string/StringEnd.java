package stepic.string;

import java.util.Arrays;
import java.util.Scanner;

public class StringEnd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = "ivanov@petr@gmail.com";
        if (isGMailAddress(str)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    static boolean isGMailAddress(String string){
        return (string.endsWith("@gmail.com") & string.split("@").length == 2);
    }
}