import java.util.Scanner;

/*
 * a = 97
 * a+25 = z
 * a + 26 = a
 * a + 27 = b = a + 1
 * a + 52 = a
 * itd
 *
 *
 * */


public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String tekst = scanner.nextLine();
        int n = scanner.nextInt();

        System.out.println(szyfruj(tekst, n));


    }

    public static String szyfruj(String in, int n) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < in.length(); i++) {
            if (in.charAt(i) == 32) { //spacji nie zmieniamy
                result = result.append(in.charAt(i));
                continue;
            } else {
                /*result = result.append((char) (in.charAt(i) + n <= 122 ?
                        in.charAt(i) + n :
                        (in.charAt(i) + n - (26 * (n / 26)) > 122 ? in.charAt(i) + n - (26 * ((n / 26)+1)) : in.charAt(i) + n - (26 * (n / 26)))
                ));*/

                if (in.charAt(i) + n <= 122) {
                    result = result.append((char) (in.charAt(i) + n));
                } else if (in.charAt(i) + n - (26 * (n / 26)) > 122) {
                    result = result.append((char) (in.charAt(i) + n - (26 * ((n / 26) + 1))));
                } else {
                    result = result.append((char) (in.charAt(i) + n - (26 * (n / 26))));
                }


            }
        }

        return result.toString();
    }
}