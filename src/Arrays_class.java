import java.util.*;

public class Arrays_class {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        String str = Arrays.toString(array);
        System.out.println(str);

        int[][] array1 = { {1, 1}, {2, 2}, {3, 3} };
        String str1 = Arrays.deepToString(array1);
        System.out.println(str1);

        int[] x1 = {1, 2, 3};
        int[] x2 = {1, 2, 3};
        System.out.println(Arrays.equals(x1, x2));

        int[][] x3 = {{1, 2, 3}, {4, 5, 6}};
        int[][] x4 = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(Arrays.deepEquals(x3, x4));

        int[] x = new int[10];
        Arrays.fill(x, 999);
        String str2 = Arrays.toString(x);
        System.out.println(str2);

        int[] x5 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[] x6 = Arrays.copyOf(x5, 5);
        String str3 = Arrays.toString(x6);

        int[] x7 = Arrays.copyOf(x5, 15);
        String str4 = Arrays.toString(x7);
        System.out.println(str3);
        System.out.println(str4);

        int[] x8 = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        int[] x9= Arrays.copyOfRange(x8, 5, 10);
        String str5 = Arrays.toString(x9);

        int[] x10 = Arrays.copyOfRange(x8, 5, 15);
        String str6 = Arrays.toString(x10);
        System.out.println(str5);
        System.out.println(str6);

        int[] x11 = {11, -2, 3, 0, 999, -20, 8, -20, 99, -20};

        Arrays.sort(x11);

        String str7 = Arrays.toString(x11);
        System.out.println(str7);

        int[] x12 = {11, -2, 3, 0, 999, -20, 8, -20, 99, -20};

        Arrays.sort(x12, 4, 8);
        String str8 = Arrays.toString(x12);
        System.out.println(str8);

        System.out.println("Ссылка на Oracle документация по классу Arrays https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/Arrays.html");

    }
}
