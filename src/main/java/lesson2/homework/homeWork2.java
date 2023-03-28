package lesson2.homework;
import java.util.Scanner;
public class homeWork2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово: ");
        String input = scanner.nextLine();
        System.out.println(palindrome(input));
    }
//    Напишите метод, который принимает на вход строку (String) и
//    определяет является ли строка палиндромом (возвращает boolean значение).
    private static boolean palindrome(String a) {
        boolean result = true;
        int j = a.length() - 1;
        for (int i = 0; i < (a.length()/2) ; i++) {
            if (a.charAt(i) == a.charAt(j)) {
                result = true;
                j--;
            } else {
                result = false;
            }
        }
        return result;
    }
}
