import java.util.Arrays;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] t1 = podaj5liczb(scanner);
        int[] t2 = podaj5liczb(scanner);

        porownaj(t1,t2);

    }

    public static int[] podaj5liczb(Scanner scanner) {
        int[] result = new int[5];

        for (int i = 0; i<result.length; i++) {
            result[i] = scanner.nextInt();
        }
        return result;
    }

    public static void porownaj (int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    System.out.println(a[i]);
                    break;
                }
            }
        }
    }


}