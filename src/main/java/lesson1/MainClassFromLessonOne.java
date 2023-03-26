package lesson1;
import java.util.Random;
import java.util.Scanner;
public class MainClassFromLessonOne {
    public static void main(String[] args) {

//      inputNameAndPrint();
//      getArrMaxCount();
        int res = getRandomArrMaxCount(1000);
        System.out.println(res);
    }
    // Задание №1. Написать программу, которая запросит пользователя ввести имя в консоли.
    // Получит введённую строку и выведет в консоль сообщение "Привет, Имя!".
    private static void inputNameAndPrint() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите своё имя: ");
        String name = scanner.nextLine();
        System.out.printf("Привет, %s!", name);
        scanner.close();
    }
    // Задание №2. Дан массив двоичных чисел, например [1, 1, 0, 1, 1, 1]. Вывести
    // максимальное количество подряд идущих 1.
    private static void getArrMaxCount() {
        int arr[] = new int[] {1, 1, 0, 1, 1, 1, 1, 0, 1};
        int count = 0;
        int temp = 0;
        for (int num : arr) {
            if (num == 1) {
                temp ++;
            }
            if (num == 0) {
                if (temp > count) {
                    count = temp;
                }
                temp = 0;
            }
        }
        System.out.println(count);
        System.out.printf("Самая большая последовательность равна %s", count);
        }

    private static int getRandomArrMaxCount(int size) {
        int[] arr = new int[size];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(0, 2);
        }

        int count = 0;
        int maxCount = 0;
        for (int num : arr) {
            if (num == 1) {
                count++;

                if (count > maxCount) {
                    maxCount = count;
                }
            } else {
                count = 0;
            }
        }
        return maxCount;
    }
}