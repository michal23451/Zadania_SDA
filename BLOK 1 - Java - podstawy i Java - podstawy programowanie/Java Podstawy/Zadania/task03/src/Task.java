import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double podatek = podatek(scanner.nextDouble());
        System.out.println(podatek);
    }

    public static double podatek(double przychod) {
        double result;
        if (przychod <= 85528) {
            result = przychod * 0.18 - 556.02;
        } else {
            result = 14839.02 + (przychod - 85528) * 0.32;
        }
        return result >= 0 ? result : 0;
    }
}