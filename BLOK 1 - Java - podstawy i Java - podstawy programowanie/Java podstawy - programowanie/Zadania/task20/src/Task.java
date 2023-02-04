import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String adreshttp = scanner.nextLine();
        System.out.println(zamienNaHttps(adreshttp));


// your code
    }

    public static String zamienNaHttps(String adres) {
        if (adres.startsWith("http://")) {
            return adres.replaceFirst("http://","https://");
        } else {
            return adres;
        }


    }
}