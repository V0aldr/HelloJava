package Syntaxis;

import java.util.Scanner;

public class NestedMaxDigit {
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);

        int firstNumber = -16;
        int secondNumber = 5;

        int min = Math.min(firstNumber, secondNumber);
        int max = Math.max(firstNumber, secondNumber);

        int theNumber=0, maxSum = 0;

        for (int i = min; i < max; i++) {
            int sum = 0;
            int digit = i;

            while (digit > 0){
                int lastDigit = digit % 10;
                sum += lastDigit;
                digit /= 10;
            }

            if (sum > maxSum){
                maxSum = sum;
                theNumber = i;
            }
        }System.out.println(theNumber);
    }
}
