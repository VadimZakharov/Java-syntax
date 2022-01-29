package Simple_actions;

import java.util.*;

public class Array_Same_Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] a = new String[5];
        String[] b = new String[a.length];


        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextLine();
        }
        System.arraycopy(a, 0, b, 0, a.length);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {

                if (a[i].equals(b[j])) {
                    if (i == j) {
                        continue;
                    }

                    System.out.println("Строка " + (i + 1) + " " + a[i] + " соответствует " + (j + 1) + " " + b[j]);

                }

                }
               }

            }
       }




