package Syntaxis;

public class ForEatch {
    public void show(){
        int [] numbres1 = new int[5];
        String [] strings = new String[3];
        strings[0] = "Hello!";
        strings[1] = "Wait!";
        strings[2] = "Good bye!";

        System.out.println("\n'For' --- strings\n");
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
        System.out.println("\n'For Each'\n");
        for (String string:strings){
            System.out.println(string);
        }

        int sum = 0;
        int [] numbers2 = {1,2,3,4,5};
        for (int element:numbers2){
            sum += element;
            System.out.println(sum);
        }
        System.out.println(sum);
    }
}
