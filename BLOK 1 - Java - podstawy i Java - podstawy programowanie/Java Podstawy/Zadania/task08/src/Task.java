import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        sum(scanner);
    }

    public static void sum(Scanner scanner) {
        int sum = 0;
        int n = sum;
        do {
            n = scanner.nextInt();
            sum += n;
        } while (n != 0);
        System.out.println(sum);
    }
}

