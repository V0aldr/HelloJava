package Syntaxis;

import java.util.Scanner;

public class DoWhile {
    public void show(){
        Scanner scanner = new Scanner(System.in);
        int value;
        do {
            System.out.println("Введите число 5: ");
            value = scanner.nextInt();
        }while (value != 5);
    System.out.println("ВЫ Ввели число 5");
    }
}
