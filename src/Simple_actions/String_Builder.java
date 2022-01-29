package Simple_actions;

public class String_Builder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");

        sb.append(" my").append(" friend");
        System.out.println(sb);
        System.out.printf("Simple_actions.This is string, %s", "Added string");
        System.out.println();
        System.out.printf("Simple_actions.This is number, %d", 10);
        System.out.println();
        System.out.printf("%f New string with (%s), and %d numbers \n",10.9," STRINGS", 5);
        System.out.printf("String lenght %10d \n", 1000000);
        System.out.printf("String lenght %10d \n", 5);
        System.out.printf("String lenght %10d \n", 9999);
        System.out.printf("String lenght %10d \n", 633);
        System.out.printf("String %.2f \n", 25.55555);
        System.out.printf("String %.2f \n", 225.55555);
    }
}
