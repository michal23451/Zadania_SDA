import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float i = scanner.nextFloat();

        System.out.println(Math.floor(i));
        System.out.println(Math.round(i));
        System.out.println(Math.ceil(i));

    }
}