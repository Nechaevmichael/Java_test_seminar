package lesson1.homeWork;

public class homeWork {
    public static void main(String[] args) {
        findMinAndMax();
    }
//  Задать одномерный массив и найти в нём минимальный и максимальный элементы.
    private static void findMinAndMax() {
        int[] arr = new int[] {1, 2, 3, 4, 2, 3, 10, 12, -1};
        int minRes = 0;
        int maxRes = 0;
        int max = arr[0];
        int min = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        System.out.printf("Минимальный элемент равен %s%n", min);
        System.out.printf("Максимальный элемент равен %s", max);
    }
}
