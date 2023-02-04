import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        result(n);


    }

    public static void result(int n) {
        for (int i = 1; i <= n; i = i * 2) {
            System.out.println(i);
        }
    }
}