package src.Сycles;

import java.util.Scanner;


class info{
    int z = (int) Math.round(4.5);// округление числа до целого
    int x = (int) Math.ceil(4.1); // округление числа до целого вверх
    int y = (int) 4.9;            // округление числа до целого вниз

} // округление чисел

public class Wind_speed_converter{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double speed_ms = sc.nextInt();
        double speed_kmh = speed_ms * 3.6;

        System.out.println(speed_kmh);
    }
} //конвертер величин скорости из м/с в км/ч




