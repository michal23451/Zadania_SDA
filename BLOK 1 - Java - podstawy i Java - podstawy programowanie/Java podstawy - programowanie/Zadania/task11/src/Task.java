import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();


        //abcdefghij
        //System.out.println(s.substring(0, s.length() - 3));  //abcdefg
        //System.out.println(s.substring(s.length() - 3)); //hij

        System.out.println(zamien(s));

    }

    public static String zamien(String in) {
        if (in.length() <= 3) {
            return in.toUpperCase();
        } else {

            char[] c = in.toCharArray();
            String out = new String();

            for (int i = c.length - 3; i < c.length; i++) {
                if (c[i] >= 'a' && c[i] <= 'z') {
                    c[i] = (char) (c[i] - 32);
                }
            }

            for (int i = 0; i < c.length; i++) {
                out = out + c[i];
            }
            return out;
        }


    }

    //abcdefghij length=10, zamieniamu 7,8,9
}