package src.NastedClasses;

public class Test {
    public static void main(String[] args) {
        Electrocar electrocar = new Electrocar(1);
        electrocar.start();

        Electrocar.Battary battary = new Electrocar.Battary();
        electrocar.start();
    }
}
