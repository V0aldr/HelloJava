package stepic.string;

public class StringMethodTxt {
    /*
    /               Методы экземпляра класса String:

        String concat(String s) (аналог «+») — слияние строк;
        boolean equals(Object ob) — сравнение строк с учетом регистра;
        boolean equalsIgnoreCase(String s) — сравнение строк без учета регистра;
        int compareTo(String s) и compareToIgnoreCase(String s) — лексикографическое сравнение строк с учетом
    и без учета их регистра. Метод осуществляет вычитание кодов первых различных символов вызывающей
    и передаваемой в метод строки и возвращает целое значение. Метод возвращает значение нуль в случае,
    когда equals() возвращает значение true;
        boolean contentEquals(StringBuffer ob) — сравнение строки и содержимого объекта типа StringBuffer;
        String substring(int n, int m) — извлечение из строки подстроки начиная с индекса n и заканчивая
    индексом m (не включая). Нумерация символов в строке начинается с нуля;
        String substring(int n) — извлечение из строки подстроки, начиная с позиции n до конца строки;
        int length() — определение длины строки;
        int indexOf(char ch)— определение позиции символа  в строке. Возвращает индекс первого появления
    символа, либо -1, если символ не обнаружен. Аналогично перегруженный метод int indexOf(String str)
    поиска индекса начала подстроки str.
        int indexOf(char ch, int n), int indexOf(String str, int n) — определение позиции символа  или
    подстроки, поиск вправо начинается с позиции n. Возвращает -1, если символ/подстрока не обнаружен;
        int lastIndexOf(char ch), int lastIndexOf(String str) — определение последней позиции символа
    или подстроки. Возвращает -1, если символ/подстрока не обнаружен;
        int lastIndexOf(char ch, int n), int lastIndexOf(String str, int n) — определение позиции символа
    или подстроки, поиск влево начинается с позиции n. Возвращает -1, если символ/подстрока не обнаружен;
        String toUpperCase()/toLowerCase() — преобразование всех символов вызывающей строки в верхний/нижний регистр;
        String replace(char с1, char с2) — замена в строке всех вхождений первого символа вторым символом.
    Есть перегрузка этого метода для замены одной подстроки другой:: String replace(String str1, String str2)
        String intern() — заносит строку в «пул» литералов и возвращает ее объектную ссылку. Пример
    использования этого метода показан далее.
        String trim() — удаление всех пробелов в начале и конце строки;
        char charAt(int position) — возвращение символа из указанной позиции (нумерация с нуля);
        boolean isEmpty() — возвращает true, если длина строки равна 0 (пустая строка);
        void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin) — извлечение символов строки от
    символа с индексом srcBegin до символа с индексом srcEnd  (не включая) в массив символов dst , размещение
    в котором начинается с индекса dstBegin;
        String[] split(String regex) — поиск вхождения в строку заданного регулярного выражения (разделителя)
    и деление исходной строки в соответствии с этим на массив строк.
        String[] split(String regex, int limit) — деление исходной строки на массив строк, используя разделитель
    regex (регулярное выражение). Параметр limit означает максимальное количество строк, которое должно быть получено.

    Поскольку литерал является объектом класса String, от его имени можно вызывать все эти методы.


     */

    public static void main(String [] args){
        String str = " Hello, world! ";
        System.out.println(str.charAt(5));
        System.out.println(str.isBlank());
        System.out.println(str.isEmpty());
        System.out.println("-------------");
        String str1 = "Ivan";
        String str2 = "Ivan";
        String str3 = new String("Ivan");
        String str4 = new String(str1);
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
        System.out.println("-------------");
        System.out.println(str1 == str3);
        System.out.println(str1.equals(str3));
        System.out.println("-------------");
        str4 = str4.intern();
        System.out.println(str4);
        System.out.println(str1 == str4);


    }



}
