import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();// Tu zaimplementuj rozwiązanie

        System.out.println(nawiasy(s));

    }

    public static String nawiasy(String in) {
        int counter = 0;
        char[] chars = in.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (counter == 0 && chars[i] == ')') {
                return "Błędne sparowanie nawiasów";
            }
            else if (chars[i] == '(') {
                counter++;
            } else if (chars[i] == ')') {
                counter--;
            }
        }

        if (counter == 0) {
            return "OK";
        } else {
            return "Błędne sparowanie nawiasów";
        }
    }
}