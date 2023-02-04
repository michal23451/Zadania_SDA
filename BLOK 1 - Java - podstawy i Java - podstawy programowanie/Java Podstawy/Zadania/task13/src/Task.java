import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        result(text);// Tu zaimplementuj rozwiązanie
    }

    public static void result(String text) {
        //text = text.toLowerCase();
        //System.out.println(text);
        if (text.contains("Java")) {
            System.out.println("Znalazłem Java");
        }
        if (text.startsWith("Java")) {
            System.out.println("Zaczyna się od Java");
        }
        if (text.endsWith("Java")) {
            System.out.println("Kończy się na Java");
        }
        if (text.equals("Java")) {
            System.out.println("Równa się Java");
        }
        if (text.contains("Java")) {
            System.out.println(text.indexOf("Java"));
        }

    }
}