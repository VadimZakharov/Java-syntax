package src.Сycles;

public class Sum_even_numbers {
    public static void main(String[] args) {
       int sum = 0;

       for (int i = 0; i < 15; i++){
           if (i % 2 == 0)
           sum = i + sum;

       }
        System.out.println(sum);
    }
}
