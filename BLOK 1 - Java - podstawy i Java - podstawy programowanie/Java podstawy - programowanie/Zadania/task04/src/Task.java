import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        System.out.println(ileKapusty(i));

    }

    public static boolean ileKapusty(int ileKg) {
        boolean result = false;
        if (ileKg < 1 || ileKg > 42) {
            result = false;
        }


        int po7Kg = ileKg/7;
        int po1Kg = (ileKg - (po7Kg * 7))/1;
        //int po1Kg = ileKg%7;

        //System.out.println(po7Kg);
        //System.out.println(po1Kg);

        if(po7Kg + po1Kg <= 6) {
            result = true;
        }

        return result;
    }
}


//max 6 opakowań
//po 1kg i 7 kg
//min 1kg, max 42kg