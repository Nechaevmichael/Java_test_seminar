package lesson2;
import java.util.Scanner;
public class lesson2 {
    public static void main(String[] args) {
        createString();
    }
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
}
