package stepic.string;

import java.util.Scanner;

public class StringConcat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] str = {scan.nextLine(), scan.nextLine(), scan.nextLine()};
        String theWord = "";
        for (int i = 0; i < str.length; i++) {
            int first = str[i].indexOf(';');
            int last = str[i].lastIndexOf(';');
            theWord = theWord.concat(str[i].substring(first+1, last));
        }

        System.out.println(theWord);
    }
}

//
//
//