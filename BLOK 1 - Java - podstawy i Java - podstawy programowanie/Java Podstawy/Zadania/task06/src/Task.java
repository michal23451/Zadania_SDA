import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a < b) {
            System.out.println(suma(a, b));
        } else {
            System.out.println("Robota skończona");
        }
    }

    public static int suma(int a, int b) {
        int result = 0;
        for (int i = a; i <= b; i++) {
            result = result + i;
        }
        return result;
    }
}