package Simple_actions;

public class Array {
    public static void main(String[] args) {

        String[] a = new String[10];
        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0 || i == 0){
                a[i] = "Четное";
            }
            else {
                a[i] = "Нечетное";
            }
            System.out.println(a[i]);
        }
    }
}