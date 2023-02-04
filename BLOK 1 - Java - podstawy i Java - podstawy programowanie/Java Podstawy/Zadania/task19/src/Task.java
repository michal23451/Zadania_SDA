import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Task {
    public static void main(String[] args) {
        // możesz tutaj wywołać metodę w celu testowania
        System.out.println(toLocalDate("yyyy-MM-dd","2022-11-12"));;

    }

    public static LocalDate toLocalDate(String pattern, String input) {
        // Tu zaimplementuj rozwiązanie
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        LocalDate result = LocalDate.parse(input,formatter);
        return result;
    }
}