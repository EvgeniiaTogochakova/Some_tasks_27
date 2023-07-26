// Задание 1. Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.
// Ввод текста вместо числа не должно приводить к падению приложения, вместо этого необходимо повторно запросить у пользователя ввод данных.


import java.util.Scanner;

import static java.lang.Float.parseFloat;

public class Task_1 {
    public static void main(String[] args) {
        System.out.println(askFloat());
    }

    public static Float askFloat() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите дробное число: ");
        float number;
        try {
            number = parseFloat(scanner.nextLine());
        } catch (NumberFormatException ex) {
            number = askFloat();
        }
        scanner.close();
        return number;

    }
}
