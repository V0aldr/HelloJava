package stepic.array;

import javax.sound.midi.MidiFileFormat;
import java.util.Random;
import java.util.Scanner;

public class ArrMinMax {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] list = new int[scan.nextInt()];
        int seed = scan.nextInt();
        Random rand = new Random(seed);

        for (int i = 0; i < list.length; i++) {
            list[i] = rand.nextInt(-5, 16);
            System.out.print(list[i] + " ");
        }
        System.out.println();

        int maxIndex = 0, minIndex = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i] >= list[maxIndex]) {
                maxIndex = i;
            } else if (list[i] < 0){
                minIndex = i;
            }
        }

        int temp = list[maxIndex];
        list[maxIndex] = list[minIndex];
        list[minIndex] = temp;

        for (int el : list) System.out.print(el + " ");
    }
}
//