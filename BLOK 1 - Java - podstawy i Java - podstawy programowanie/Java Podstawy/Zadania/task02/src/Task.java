import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float fahrenheit = przelicz(scanner.nextFloat());
        System.out.println(fahrenheit);
    }

    public static float przelicz(float celsjusz) {
        return 1.8f * celsjusz + 32.0f;
    }
}