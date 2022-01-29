package Simple_actions;

import java.util.*;

public class Arrays_class {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        String str = Arrays.toString(array);
        System.out.println(str); // Переменная str будет содержать строковое значение:  "[1, 2, 3]"


        int[][] array1 = { {1, 1}, {2, 2}, {3, 3} };
        String str1 = Arrays.deepToString(array1);
        System.out.println(str1); // Переменная str будет содержать строковое значение:  "[[1, 1], [2, 2], [3, 3]]"


        int[] x1 = {1, 2, 3};
        int[] x2 = {1, 2, 3};
        System.out.println(Arrays.equals(x1, x2)); // Сравнивает содержимое массивов (True/False)

        int[][] x3 = {{1, 2, 3}, {4, 5, 6}};
        int[][] x4 = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(Arrays.deepEquals(x3, x4)); // Сравнивает содержимое массива массивов (True/False)

        int[] x = new int[10];
        Arrays.fill(x, 999);
        String str2 = Arrays.toString(x);
        System.out.println(str2); // Заполняет массив значением

        int[] x5 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[] x6 = Arrays.copyOf(x5, 5);
        String str3 = Arrays.toString(x6); // Копирует массив или часть массива или создаёт новый с частью старого

        int[] x7 = Arrays.copyOf(x5, 15);
        String str4 = Arrays.toString(x7);
        System.out.println(str3);
        System.out.println(str4); // Копирует массив или часть массива или создаёт новый с частью старого

        int[] x8 = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        int[] x9= Arrays.copyOfRange(x8, 5, 10);
        String str5 = Arrays.toString(x9);  // Копирует промежуток массива

        int[] x10 = Arrays.copyOfRange(x8, 5, 15);
        String str6 = Arrays.toString(x10);
        System.out.println(str5);
        System.out.println(str6);

        int[] x11 = {11, -2, 3, 0, 999, -20, 8, -20, 99, -20};

        Arrays.sort(x11);

        String str7 = Arrays.toString(x11);
        System.out.println(str7); // Сортирует числа массива от большего к меньшему

        int[] x12 = {11, -2, 3, 0, 999, -20, 8, -20, 99, -20};

        Arrays.sort(x12, 4, 8);
        String str8 = Arrays.toString(x12);
        System.out.println(str8); // Сортирует промежуток массива

        System.out.println("Ссылка на Oracle документация по классу Arrays https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/Arrays.html");
        System.out.println("https://javarush.ru/groups/posts/massivy-java " + " https://javarush.ru/groups/posts/1932-koe-chto-o-massivakh " + " https://javarush.ru/groups/posts/1933-klass-arrays-i-ego-ispoljhzovanie");
    }
}
