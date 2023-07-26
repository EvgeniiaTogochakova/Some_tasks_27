// Задание 4. Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {askString();}

    public static void askString() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String line = scanner.nextLine();
        scanner.close();
        if (line =="") throw new RuntimeException("А пустые строки вводить нельзя");

    }
}
