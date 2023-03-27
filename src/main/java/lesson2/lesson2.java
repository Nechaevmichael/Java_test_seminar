package lesson2;

import java.util.Scanner;
import java.lang.String;

public class lesson2 {
    public static void main(String[] args) {
//        createString();
        countchar();
//        palindrome();
    }

    //    Дано четное число N (>0) и символы c1 и c2.
//    Написать метод, который вернет строку длины N, которая состоит из чередующихся символов c1 и c2, начиная с c1.
    private static void createString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину строки: ");
        int num = scanner.nextInt();
        StringBuilder sb = new StringBuilder();
        String a = "c1";
        String b = "c2";
        for (int i = 0; i < num; i++) {
            if (i % 2 == 0) {
                sb.append(a);
            } else {
                sb.append(b);
            }
        }
        System.out.println(sb.toString());
    }

    //    Напишите метод, который сжимает строку.
//    Пример: вход aaaabbbcdd.
    private static void countchar() {
        String str = "aaaabbbcdddd";
        StringBuilder result = new StringBuilder();
        int count = 1;
        for (int i = 0; i < str.length() - 1; i++) {

            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                if (count == 1) {
                    result.append(str.charAt(i));
                } else {
                    result.append(str.charAt(i)).append(count);
                    count = 1;
                }
            }
        }
        System.out.println(result.append(str.charAt(str.length() - 1)).append(count > 1 ? count : "").toString());
    }

    //    Напишите метод, который принимает на вход строку (String) и определяет
//    является ли строка палиндромом (возвращает boolean значение).
    private static void palindrome() {
        String str = "asdf";

    }
}
