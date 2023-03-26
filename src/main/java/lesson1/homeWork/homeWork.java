package lesson1.homeWork;
import java.util.Arrays;
public class homeWork {
    public static void main(String[] args) {
//      findMinAndMax();
        removeNumberToEndArray();
    }
//  Задать одномерный массив и найти в нём минимальный и максимальный элементы.
    private static void findMinAndMax() {
        int[] arr = new int[] {1, 2, 3, 4, 2, 3, 10, 12, -1};
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

//  Дан массив nums = [3,2,2,3] и число val = 3.
//  Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
//  Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного,
//  а остальные - равны ему.
    private static void removeNumberToEndArray() {
        int[] arr = new int[] {3, 2, 3, 2, 3, 10, 12, 3, -1};
        int number = 3;
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != number) {
                if (i != j) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
