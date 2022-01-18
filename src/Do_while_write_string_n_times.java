import java.util.Scanner;


public class Do_while_write_string_n_times {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String s = console.nextLine();
        int i = console.nextInt();
        if (i > 0 && i < 6) {
            do {
                System.out.println(s);
                i--;
            } while (i != 0);
        }
    }
}