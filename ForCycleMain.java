import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int value = new Scanner(System.in).nextInt();
        for (int i = 1; i <= value; i = i + 1) {
            for (int a = value; a >= 1; a = a - 1) {
                int result = i * a;
                if (result == value) {
                    System.out.println(i + "*" + a);
                }
            }
        }
    }
}
