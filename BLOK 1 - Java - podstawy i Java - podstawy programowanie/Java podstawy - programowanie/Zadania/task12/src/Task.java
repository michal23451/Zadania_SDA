import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(s
                .replace("kurka wodna", "***")
                .replace("motyla noga", "***")
                .replace("psiakrew", "***")
        );
    }
}