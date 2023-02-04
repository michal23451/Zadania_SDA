import java.util.Scanner;

public class Task {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double rata = rata(scanner.nextDouble(), scanner.nextInt());
        System.out.println(rata);
    }

    public static double rata(double kwota, int iloscRat) {
        kwota = (kwota < 100 || kwota > 10000) ? 5000 : kwota;
        iloscRat = (iloscRat < 6 || iloscRat > 48) ? 36 : iloscRat;

        if (iloscRat >= 6 && iloscRat <= 12)
            kwota = kwota * 1.025;
        else if (iloscRat >= 13 && iloscRat <= 24)
            kwota = kwota * 1.05;
        else if (iloscRat >= 25 && iloscRat <= 48)
            kwota = kwota * 1.10;

        return kwota / iloscRat;
    }
}