import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        result(scanner);// Tu zaimplementuj rozwiązanie
    }

    public static void result(Scanner scanner) {
        int in = scanner.nextInt();
        for (int i = 1; i <= in; i++) {
            if (in % i == 0) {
                System.out.println(i);
            }
        }
    }
}