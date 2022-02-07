package src.Exceptions;

import java.util.Scanner;
// Выбрасывание исключений
public class Test2 {
    public static void main(String[] args) throws ScannerException {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int x = Integer.parseInt(sc.nextLine());
            if (x != 0) {
                 throw new ScannerException("Пользователь ввёл не ноль");
                }
            }

        }

    }


