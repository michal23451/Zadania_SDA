import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(resztaZDzielenia(a, b));

// your code
    }

    public static int resztaZDzielenia(int a, int b) {
        int liczbaWieksza = (a > b) ? a : b;
        int liczbaMniejsza = (a > b) ? b : a;

        if (liczbaMniejsza == liczbaWieksza) {
            return 0;
        }

        //11 / 3  - reszta 2

        int counter = 0;

        for (int i = liczbaMniejsza; i <= liczbaWieksza; i += liczbaMniejsza) {
            counter++;
        }

        return liczbaWieksza - (liczbaMniejsza * counter);

    }
}