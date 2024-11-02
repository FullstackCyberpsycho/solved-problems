package problem2;

import java.util.*;

class Main {

    public static void main(String[] ar) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Введите число: ");
            try {
                num = scanner.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Ошибка: введено не целое число. Пожалуйста, попробуйте снова.");
                scanner.next();
            }
        }

        if (num % 2 == 0) {
            System.out.println("Число четное");
        } else {
            System.out.println("Число нечетное");
        }

        scanner.close();
    }
}
