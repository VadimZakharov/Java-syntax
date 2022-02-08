package src.SaveToFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/SaveToFile/SomeFile.txt");
        PrintWriter pr = new PrintWriter(file);

        pr.println("Test row 1"); //запись строк
        pr.println("Test row 2");

        pr.close();

        Scanner sc = new Scanner(file); //чтение строк
        while (sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
        sc.close();



    }

}
