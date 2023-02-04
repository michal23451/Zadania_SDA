import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        czyPierwsza(number);// Tu zaimplementuj rozwiązanie
    }

    public static boolean czyPierwsza(int in) {
        if (in <= 1) {
            System.out.println("Przerywam pracę");
            return false;
        } else if (in >= 2) {
            for (int i = 2; i <= in; i++) {
                if (in != i && in % i == 0) {
                    System.out.println("Nie");
                    return false;

                } else {
                    System.out.println("Tak");
                    return true;
                }
            }
        }
        return false;
    }

}