package src.ReadingFromAFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {


        File file = new File("src/ReadingFromAFile/texty.txt");
        File file1 = new File("src/ReadingFromAFile/text numbers.txt");



        Scanner sc = new Scanner(file);
        Scanner sc1 = new Scanner(file1);
        String line = sc1.nextLine();
        String [] numbersString = line.split(" ");
        int [] numbers = new int [3];
        int counter = 0;
        System.out.println(Arrays.toString(numbersString));

        for (String number : numbersString){
           numbers[counter++] = Integer.parseInt(number);

        }
        System.out.println(Arrays.toString(numbers));
        while (sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
        sc.close();
    }
}
