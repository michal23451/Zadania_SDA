import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(czyPrzeciwneZnaki(a, b));
    }

    public static boolean czyPrzeciwneZnaki(int a, int b) {
        boolean result = false;
        if (a==0 && b==0) {
            result = false;
        }

        if (a * b < 0){
            result = true;
        }

        return result;
    }
}