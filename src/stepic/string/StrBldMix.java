package stepic.string;

import java.util.Arrays;
import java.util.Scanner;

public class StrBldMix {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String[] words = "one kobra load absurd exel drotik ".trim().split(" +");

        StringBuilder sb = new StringBuilder(words[0]);
        // Замыкающая слово опорная буква
        String chr = words[0].substring(words[0].length() - 1);

        for (int i = 1; i < words.length; i++) {
           for (int j=1; j < words.length; j++){
               if (!words[j].startsWith(chr)) continue; //Сокращаем выполнение кода через отсекание
               sb.append(" ").append(words[j]);         // else
               chr = words[j].substring(words[j].length() - 1); // переазначаем опорную букву
               words[0] = "";       // удаляем слова из массива  Array.pop // .remove не завезли :(
               words[j] = "";
               break;   // отсекаем лишние подходы кода
           }
        }System.out.println(sb);
    }
}


//trolli emodji road tiger dog insert game  	trolli insert tiger road dog game emodji
//one kobra load absurd exel drotik 	        one exel load drotik kobra absurd