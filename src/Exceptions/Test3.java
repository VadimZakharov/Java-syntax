package src.Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//Checked (Compile time exception исключение во время коомпиляции) and Unchecked (Runtime исключения, ошибка во время работы программы)


public class Test3 {
    public static void main(String[] args) {
        File file = new File("test");
        try {
            Scanner sc = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Тут проблема");
        }


        // Runtime exception ошибка во время работы программы

        int a = 1/0;
        String name = null;
        name.length();
        int [] arr = new int[2];
        System.out.println(arr[2]);
    }
}
