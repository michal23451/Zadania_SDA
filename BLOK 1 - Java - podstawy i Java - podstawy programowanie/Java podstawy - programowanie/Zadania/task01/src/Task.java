import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float v = scanner.nextFloat();
        System.out.println(mileNaKilometry(v));
    }

    static float mileNaKilometry(float mile) {
        return 1.6F * mile;
    }

}

