import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();// Tu zaimplementuj rozwiązanie
        System.out.println(replace(s));
    }

    public static String replace(String s) {
        String result = s.replace(",", "-MAKARENA");
        return result;
    }
}