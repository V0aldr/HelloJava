package stepic;

import java.util.Scanner;

public class DayOfWeak {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String day = scan.nextLine();
        scan.close();

        switch (day) {
            case "Понедельник", "понедельник":
                System.out.println("Monday"); break;
            case "Вторник", "вторник":
                System.out.println("Tuesday"); break;
            case "Среда", "среда":
                System.out.println("Wednesday"); break;
            case "Четверг", "четверг":
                System.out.println("Thursday"); break;
            case "Пятница", "пятница":
                System.out.println("Friday"); break;
            case "Суббота", "суббота":
                System.out.println("Saturday"); break;
            case "Воскресенье", "воскресенье":
                System.out.println("Sunday"); break;
            default:
                System.out.println("ERROR");

        }
    }
}
