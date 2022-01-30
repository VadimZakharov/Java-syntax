package src.Arrays;

import java.util.*;

public class Array_of_arrays {
    public static void main(String[] args) {
        String [][] multiplication_table = new String [10][10];
        for (int i = 0; i < 10; i++) {
            System.out.println();
            for (int j = 0; j <10; j++) {
                multiplication_table[i][j] = (i + " * " + j + " = " + (i * j) + " ");


                if (j == 1) {


                    System.out.print(multiplication_table[i][j]);


                }
                else if (j == 2) {


                    System.out.print(multiplication_table[i][j]);
                }
                else if (j == 3) {


                    System.out.print(multiplication_table[i][j]);
                }
                else if (j == 4) {


                    System.out.print(multiplication_table[i][j]);
                }
                else if (j == 5) {


                    System.out.print(multiplication_table[i][j]);
                }
                else if (j == 6) {


                    System.out.print(multiplication_table[i][j]);
                }
                else if (j == 7) {


                    System.out.print(multiplication_table[i][j]);
                }
                else if (j == 8) {


                    System.out.print(multiplication_table[i][j]);
                }
                else if (j == 9) {


                    System.out.print(multiplication_table[i][j]);
                }
            }
        }

        }
    }

