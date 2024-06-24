package stepic.string;

import java.util.Arrays;
import java.util.Scanner;

public class StrReplace {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String line = " A good    dog deserves a    good bone or goodness ";
        String sub = "good";


//        String[] txt = line.split(" +");
//        String seq = String.join(" ", txt);
//        System.out.println(seq);

        String[] txt = line.split(" +");
        String result = "";
        for (int i=0; i < txt.length; i++){
            if (txt[i].equals(sub)) continue;
            result += txt[i] + " ";
        }
        result = result.strip();
        System.out.println(result);
    }
}


//  A good    dog deserves a    good bone or goodness
//good
// better late than never better >>> late than never
//better