
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Task {
    public static void main(String[] args) {
        // możesz tutaj wywołać metodę w celu testowania

        calculateDifference("2014::01::23", "03--2020-30");

    }

    public static int[] calculateDifference(String dateA, String dateB) {
        // Tu zaimplementuj rozwiązanie
        DateTimeFormatter formatterA = DateTimeFormatter.ofPattern("yyyy::MM::dd");
        DateTimeFormatter formatterB = DateTimeFormatter.ofPattern("MM--yyyy-dd");

        LocalDate a = LocalDate.parse(dateA,formatterA);
        LocalDate b = LocalDate.parse(dateB,formatterB);

        int years = Period.between(a, b).getYears();
        int months = Period.between(a, b).getMonths();
        int days = Period.between(a, b).getDays();



        return new int[]{years,months,days};
    }
}