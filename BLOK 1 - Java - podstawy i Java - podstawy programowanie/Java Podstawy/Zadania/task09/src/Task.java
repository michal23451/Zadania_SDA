import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        result(scanner);
    }

    public static void result(Scanner scanner) {
        int min;
        int max;
        int in;

        in = scanner.nextInt();
        min = in;
        max = in;

        do {
            in = scanner.nextInt();

            if (in > max && in != 0) {
                max = in;
            }
            if (in < min && in != 0) {
                min = in;
            }

        } while (in != 0);
        System.out.println(min + max);
        System.out.println((min + max) / 2.0);

    }
}