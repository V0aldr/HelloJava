package stepic;

import java.util.Scanner;

public class WorkingDay {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int day = scan.nextInt();
        scan.close();
        switch (day) {
            case 1, 2, 3, 4, 5:
                System.out.println("Working day");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("ERROR");
        }
    }
}
