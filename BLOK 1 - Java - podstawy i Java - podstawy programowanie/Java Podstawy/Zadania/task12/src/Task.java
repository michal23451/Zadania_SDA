import java.util.Arrays;

public class Task {
    public static void main(String[] args) {
        int[] numbers = Arrays
                .stream(args)
                .mapToInt(Integer::parseInt)
                .toArray();

        result(numbers);// Tu zaimplementuj rozwiązanie
    }

    public static void result(int[] numbers) {
        int[] result = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0; i < numbers.length; i++) {
            result[numbers[i]]++;
        }

        for (int i = 1; i < result.length; i++) {
            System.out.println(i + " - " + result[i]);
        }


    }
}