import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        check(scanner.nextInt(), scanner.nextFloat());
    }

    public static void check(int height, float weight) {
        if (height > 150 && weight <= 180) {
            System.out.println("Zapnij pasy!");
        } else {
            System.out.println("Przykro mi, nie możesz jechać!");
        }
    }
}