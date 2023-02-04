import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // your code

        int x = scanner.nextInt();
        int y = scanner.nextInt();

        if (!check(x, y)) {
            return;
        }

        print7(x, y);


    }

    public static boolean check(int x, int y) {
        return (x > y) || (x < 0 || x > 10000) || (y < 0 || y > 10000) ? false : true;
    }

    public static void print7(int x, int y) {
        if (!check(x, y)) {
            return;
        }

        for (int i = x; i <= y; i++) {
            if (i % 7 == 0) {
                System.out.println(i);
            }
        }

    }

}