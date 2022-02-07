package src.Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// Обработка исключений

public class Test {


    public static void main(String[] args) throws FileNotFoundException {


        readFile();

        File file = new File("src/Exceptions/tex.txt");

        try {
            Scanner sc = new Scanner(file);
            System.out.println("Программа выполнилась");
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");

        }
        System.out.println("Код выполняется дальше");

    }

    public static void readFile() throws FileNotFoundException {
        File file1 = new File("src/Exceptions/text.txt");
        Scanner sc1 = new Scanner(file1);



    }


}
