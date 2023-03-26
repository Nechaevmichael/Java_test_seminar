package lesson1;
import java.util.Scanner;
public class MainClassFromLessonOne {
    public static void main(String[] args) {
        exeOne();
    }

    private static void exeOne() {
        // Задание №1. Написать программу, которая запросит пользователя ввести имя в консоли.
        // Получит введённую строку и выведет в консоль сообщение "Привет, Имя!".
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите своё имя: ");
        String name = scanner.nextLine();
        System.out.printf("Привет, %s!", name);
        scanner.close();
    }



}
