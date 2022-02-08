package src;

import java.util.Scanner;

public class TimeManagement {

    public static void main(String[] args) {
        System.out.println("Сколько было собесов?");
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // считывает колличество собесов
        int a = t *40; // 40 минут идёт собес
        int hours = a / 60; //часы
        int minutes = a % 60; // минуты
        System.out.println("Поздравляю ты отработал");
        System.out.printf("%d:%02d", hours, minutes);

    }
}