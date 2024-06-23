package stepic.string;

import java.util.Arrays;
import java.util.Scanner;

public class StringReplaceTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = "intel.com.think.com";
        System.out.println(delCom(str));
    }

    static String delCom(String string){
        if (string.endsWith(".com")){
            string = string.substring(0, string.lastIndexOf(".com"));
        }
        return string;
    }
}
