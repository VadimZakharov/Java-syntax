package Simple_actions;

import java.util.Arrays;

public class Combining_arrays {
    public static void main(String[] args) {

        int[] a = new int[10];
        int[] b = new int[5];
        int i = a.length + b.length;
        int[] c = new int[i];


        for (int j = 0; j < a.length; j++) {
            a[j] = 2;

        }
        for (int t = 0; t < b.length; t++) {
            b[t] = 1;

        }

        for (int w = 0; w < a.length; w++) {
            c[w] = a[w];
        }
        for (int e = 0; e < b.length; e++) {
            c[e + a.length] = b[e];

        }

        for (int q = 0; q < c.length; q++) {
            System.out.println(c[q]);

        }


        Arrays.fill(a,2);
        Arrays.fill(b,1);

        System.arraycopy(a,0,c,0,a.length);
        System.arraycopy(b,0,c,0+a.length,b.length);
        for(int j :c)
        {
        System.out.println(j);

    }

}
}

