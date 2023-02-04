import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        LocalDate date = LocalDate.parse(s);

        DayOfWeek dayOfWeek = date.getDayOfWeek();
        int counter = 0;

        while (!dayOfWeek.plus(counter).equals(DayOfWeek.FRIDAY)) {
            counter++;
        }

        LocalDate result = date.plusDays(counter);

        System.out.println(result);

// your code
    }
}