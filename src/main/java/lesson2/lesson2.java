package lesson2;

public class lesson2 {
    public static void main(String[] args) {
        createString();
    }
    private static void createString() {
        int n = 7;
        StringBuilder sb = new StringBuilder();
        String a = "c1";
        String b = "c2";
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                sb.append(a);
            } else {
                sb.append(b);
            }
        }
        System.out.println(sb.toString());
    }
}
