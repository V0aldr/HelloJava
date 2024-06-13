/**
SCanner
*/

package Syntaxis;

import java.io.PrintStream;
import java.util.Scanner;

public class Input {
    public void show(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter something >>>  ");
        String str = input.nextLine();
        System.out.println("Yours input is - " + "\n" + str);

    }
}
