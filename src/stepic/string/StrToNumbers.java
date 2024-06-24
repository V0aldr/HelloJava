package stepic.string;

import java.util.Arrays;
import java.util.Scanner;

public class StrToNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = "3yu6*59*4 klop35 rabbit";
        StringBuilder sb = new StringBuilder();

        int sum = 0, counter = 0; //Сумма и счётчик цифр для флага
        for (int i = 0; i < str.length(); i++) {
            int code = str.charAt(i) - '0';
            if (code >= 10) continue;   // Отсекатель букв
            if (code >= 0){             // Отсекатель символов
                sb.append(code).append("+");
                sum += code;
                counter++;
            }
        }

        if (counter == 0){
            System.out.println("ERROR");
            return;
        }

        sb.deleteCharAt(sb.length() -1); // Удаляем последний "+"
        System.out.println(sb.append("=").append(sum));
    }
}


/*
1 	ab34c#5i02k tolkien25 	        3+4+5+0+2+2+5=21
2 	3yu6*59*4 klop35 rabbit 	    3+6+5+9+4+3+5=35
3 	monkey tiger rabbit 	        ERROR
4 	monkey tiger rabbit 00000 	    0+0+0+0+0=0
*/