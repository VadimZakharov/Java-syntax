package Simple_actions;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Min_Max_Value {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введи число");
        int a = sc.nextInt();
        int [] b = new int[a] ;

        for (int i = 0; i < a; i++) {
            b[i] = i;
        }
        Arrays.sort(b);
        System.out.println("Min value "+b[0]);
        System.out.println("Max value "+b[b.length-1]);




    }
}
