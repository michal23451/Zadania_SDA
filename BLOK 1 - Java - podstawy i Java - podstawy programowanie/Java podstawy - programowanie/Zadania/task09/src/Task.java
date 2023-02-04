import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // your code
        int x = scanner.nextInt();
        choinka(x);
    }

    public static void choinka(int ilePoziomow) {     //4
        int maxSzerokosc = 2 * ilePoziomow - 1;       //7
        int poziom = 1;
        int ileGwiazdek = 1;

        while (poziom <= ilePoziomow) {
            for (int i = poziom; i <= ilePoziomow - 1; i++) { //rysujemy spacje
                System.out.print(" ");
            }
            for (int j = 1; j <= ileGwiazdek; j++) { //rysujemy gwiazdki
                System.out.print("*");  //1  3  5  7  ... maxSzerokosc
            }
            System.out.println();
            poziom++;
            ileGwiazdek+=2;
        }
        for (int i = 1; i <= ilePoziomow - 1; i++) { //rysujemy pień
            System.out.print(" ");
        }
        System.out.print("#");

    }
}
/* //4
   *
  ***
 *****
*******
   #

 */

/* //5
    *
   ***
  *****
 *******
*********
    #

 */