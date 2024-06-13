package Syntaxis;

public class MultiDimentionMassive {
    public void show(){
        int [] d1array = {1,2,3};
        int [][] d2array = {{1,2,3},
                            {4,5,6},
                            {7,8,9}};

        for (int i = 0; i < d1array.length; i++) {
            System.out.println(d1array[i]);
        }

        System.out.println("D2ARRAY");
        for (int i = 0; i < d2array.length; i++) {
            for (int j = 0; j < d2array[i].length; j++) {
                System.out.print(d2array[i][j] + "");
            }
        System.out.println();
        }
    }
}
