import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();

        System.out.println(silnia(i));

// your code
    }

    public static int silnia(int in) {
        int result = 1;
        for (int i = 1; i <= in; i++) {
            result = result * i;
        }
        return result;
    }
}