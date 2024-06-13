package Syntaxis;

import java.util.Scanner;

public class SwitchCase {
    public void show(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int value = scanner.nextInt();

        switch(value){
            case 0:
                System.out.println("Не достаточно!");
                break;
            case 18:
                System.out.println("Годится!");
                break;
            case 31:
                System.out.println("Самый смак!");
                break;
            default:
                System.out.println("Прочие случаи!");
                //break; not necessary
        }

    }
}
