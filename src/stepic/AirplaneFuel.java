/**
 * Грузовой самолет должен пролететь с грузом из пункта А в пункт С через пункт В.
 * Емкость бака для топлива у самолета – 300 литров. Потребление топлива на 1 км в
 * зависимости от веса груза у самолета следующее:
 * <p>
 * - до 500 кг  (включительно) :    1 литров / км
 * <p>
 * - до 1000 кг (включительно):   4 литров / км
 * <p>
 * - до 1500 кг (включительно):   7 литров / км
 * <p>
 * - до 2000 кг (включительно):   9 литров / км.
 * <p>
 * - более 2000 кг – самолет не поднимает.
 * <p>
 * Пользователь вводит расстояние между пунктами А и В,  расстояние между пунктами В и С,
 * а также вес груза. Программа должна рассчитать какое минимальное количество топлива
 * необходимо для дозаправки самолету в пункте В, чтобы долететь из пункта А в пункт С.
 * В случае невозможности преодолеть любое из расстояний – программа должна вывести ERROR.
 * <p>
 * Числовой результат работы программы округляется до двух знаков после десятичной точки.
 */


package stepic;

import java.util.Locale;
import java.util.Scanner;

public class AirplaneFuel {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        int ab = 200;
        int bc = 200;
        int weight = 2300;

        double bcFuel;

        // Face Control
        if (weight > 2000 || ab > 300 || bc > 300) {
            System.out.println("ERROR");
            return;

        } else if (weight > 1500 & weight <= 2000) {
            if (ab * 9 > 300 || bc * 9 > 300) {
                System.out.println("ERROR");
                return;
            } else {
                bcFuel = bc * 9 - (300 - ab * 9);
                if (bcFuel < 0) {
                    System.out.printf("%.2f", 00.00);
                    return;
                }
                System.out.printf("%.2f", bcFuel);
            }

        } else if (weight > 1000 & weight <= 1500) {
            if (ab * 7 > 300 || bc * 7 > 300) {
                System.out.println("ERROR");
                return;
            } else {
                bcFuel = bc * 7 - (300 - ab * 7);
                if (bcFuel < 0) {
                    System.out.printf("%.2f", 00.00);
                    return;
                }
                System.out.printf("%.2f", bcFuel);
            }

        } else if (weight > 500 & weight <= 1000) {
            if (ab * 4 > 300 || bc * 4 > 300) {
                System.out.println("ERROR");
                return;
            } else {
                bcFuel = bc * 4 - (300 - ab * 4);
                if (bcFuel < 0) {
                    System.out.printf("%.2f", 00.00);
                    return;
                }
                System.out.printf("%.2f", bcFuel);
            }

        } else {
            if (ab > 300 || bc > 300) {
                System.out.println("ERROR");
                return;
            } else {
                bcFuel = bc - (300 - ab);
                if (bcFuel < 0) {
                    System.out.printf("%.2f", 00.00);
                    return;
                }
                System.out.printf("%.2f", bcFuel);
            }

        }

    }
}

