import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(nwd(a,b));
// your code
    }

    public static int nwd(int a, int b) {


        while (b != 0) {
            int c = a % b;
            a = b;
            b = c;
        }

        return a;
    }
}