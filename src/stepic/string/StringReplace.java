package stepic.string;

import java.util.Scanner;

public class StringReplace {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        str = str.replace(";", ".,");
    }
}
