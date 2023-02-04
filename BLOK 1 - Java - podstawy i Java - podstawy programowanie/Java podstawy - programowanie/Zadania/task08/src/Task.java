import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        print(x);


// your code
    }

    public static void print(int x) {
        if (x == 0) {
            System.out.println(x);
        } else if (x > 0) {
            for (int i = x; i >= 0; i--) {
                System.out.print(i + " ");
            }
        } else if (x < 0) {
            for (int i = x; i <= 0; i++) {
                System.out.print(i + " ");
            }
        }
    }
}