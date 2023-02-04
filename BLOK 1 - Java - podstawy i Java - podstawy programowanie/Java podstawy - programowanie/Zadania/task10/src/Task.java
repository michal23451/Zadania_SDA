import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String tekst = scanner.nextLine();

        System.out.println(czyPalindrom(tekst));

    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static boolean czyPalindrom(String tekst){
        String tmp = tekst.toLowerCase().replace(" ", "").replace(".", "");
        StringBuilder sb = new StringBuilder(tmp);
        StringBuilder sbr = new StringBuilder(tmp).reverse();

        return sb.toString().equals(sbr.toString()) ? true : false;

    }
}

