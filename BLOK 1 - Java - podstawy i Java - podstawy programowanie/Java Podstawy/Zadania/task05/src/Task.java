import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        int max = new Scanner(System.in).nextInt();

        for (int i = 1; i <= max; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}