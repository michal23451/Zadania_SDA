import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();// Tu zaimplementuj rozwiązanie
        System.out.println(odwroc(s));

    }

    public static String odwroc(String in) {
        StringBuilder stringBuilder = new StringBuilder(in).reverse();
        String result = String.valueOf(stringBuilder);
        return result;
    }
}