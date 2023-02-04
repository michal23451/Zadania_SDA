import java.util.Scanner;

public class Task {
    static final int ZAKRES = 10;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(czyBlisko(scanner));

// your code
    }

    public static boolean czyBlisko(Scanner scanner) {
        int number = scanner.nextInt();
        return (number <= 100+ZAKRES && number>= 100-ZAKRES) ? true:false;
    }
}