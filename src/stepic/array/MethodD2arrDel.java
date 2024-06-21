package stepic.array;

import java.util.Scanner;
import java.util.Random;

public class MethodD2arrDel {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        int[][] mas = new int[scan.nextInt()][scan.nextInt()];
        long seed = scan.nextLong();
        int ind = scan.nextInt();
        initArray(mas, seed);
        printArray(mas);
        System.out.println();
        mas = deleteRow(mas, ind);
        printArray(mas);
    }

    static void initArray(int[][] array, long seed){
        Random rand = new Random(seed);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = rand.nextInt(0, 11);
            }
        }
    }

    static void printArray(int[][] array){
        for (int[] list : array){
            for (int numb : list){
                System.out.print(numb + "\t");
            }
            System.out.println();
        }
    }

    static int[][] deleteRow(int[][] array, int index){
        /*
            Функция разбивает массив по индексу(int index) на две части
            и записывает их в новый массив(array.length - 1), который короче
            на еденицу(удаление 1 строки)
         */

        // Проверка индекса
        if (index < 0 || index >= array.length) return array;

        int[][] newArray = new int[array.length - 1][array[0].length];
        // Первая часть нового массива (до индекса)
        for (int i = 0; i < index; i++) {
            for (int j = 0; j < newArray[i].length; j++) {
                newArray[i][j] = array[i][j];
            }
        }
        // Вторая часть нового массива (после индекса)
        for (int i = index ; i < newArray.length; i++) {
            for (int j = 0; j < newArray[i].length; j++) {
                newArray[i][j] = array[i + 1][j];    // !!! array[i + 1]
            }
        }
        return newArray;
    }

}


// 	4 3 77 2    норма
// 3 4 190 0    ноль-индекс
// 3 2 155 3    длина массива=индексу


