package stepic.string;

import java.io.UnsupportedEncodingException;

public class HelloString {
    static public void main(String[] args){
        // Инициализировать строку строковым литералом:
        String myString = "Это тестовая строка";

        // Можно также воспользоваться операцией new:
        String s = new String(); //создание пустой строки
        String name = new String("Вася");

        //  Создать строку на основе массива символов:
        char chars[] = {'a', 'b', 'c'};
        String s2 = new String(chars);
        System.out.println(s2); //выводит abc

        // Создать строку на основе части массива символов:
       // String(char chars[], int начальныйИндекс, int числоСимволов);

        char chars2[] = {'a', 'b', 'c', 'd', 'e', 'f'};
        String s3 = new String(chars2, 2, 3);
        System.out.println(s3); //выводит cde

        // Создать строку с указанием кодировки
        try{
            String s5 = new String(s3.getBytes(), "UTF-8");
            System.out.println(s5);
        }catch(UnsupportedEncodingException exc){
            System.out.println("Кодировка не поддерживается");
        }

        // операция сцепления (конкатенации): + .
        String str = "Мне " + "нравится " + "Java.";

        // Статические методы класса String
        String s4 = String.valueOf(.5);
        System.out.println("String.valueOf(.5) = " + s4);

        String result = String.format("Жили у бабуси %d веселых гуся", 2);
        System.out.println("result - " + result);
        double x = 3.14569987;
        String out = String.format("x=%10.3f", x);
        System.out.println(out.length() + " " + out);

        // ==
        String st1 = new String("Alex");
        String st2 = new String("Alex");
        System.out.println("st1 == st2 >>> " + (st1 == st2));
        String st3 = st1;
        System.out.println("st3 == st1 >>> " + (st3 == st1));
        System.out.println("st1.equals(st2) >>> " + st1.equals(st2));
        System.out.println("st3.equals(st1) >>> " + st3.equals(st1));

        // int compareTo(String s)
        String ss3 = new String("Ivan");
        String ss5=new String("Petr");
        if(ss3.compareTo(ss5) > 0){
              System.out.println("Первая строка больше");
        }else if(ss3.compareTo(ss5) < 0){
              System.out.println("Первая строка меньше"); //будет этот вывод
        }else{
              System.out.println("Строки равны");
        }





    }
}
