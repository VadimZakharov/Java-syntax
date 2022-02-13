package src.Enum;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Animal animal = Animal.CAT;

        System.out.println(animal);

        Seasons season = Seasons.WINTER;
        Seasons summer = Seasons.SUMMER;

        System.out.println(season);

        System.out.println(season.name()); //азвание enum так как он задикларирован
        System.out.println(animal.name());

       Animal userImput =  Animal.valueOf("CAT"); // из строки получаем enum
        System.out.println(userImput.toString());

        System.out.println(summer.ordinal()); // показывает порядковый номер (индекс)





    }

}

