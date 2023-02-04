import java.lang.reflect.Array;
import java.util.*;

public class Task {
    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        //input = "Ala lubi koty, ale nie jest przez Koty lubiana.";
        input = input.replaceAll("[\\p{P}\\p{S}]", ""); //pozbywamy się znaków inrerpunkcyjnych i matematycznych
        String[] array = input.split(" "); //tworzymy tablicę
        array = elementToLowerAndSort(array);
        String[][] tmp = new String[array.length][2];
        for (int w = 0; w < tmp.length; w++) {
            tmp[w][0] = "";
            tmp[w][1] = "";
        }
        int counter = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i].equals(array[j])) {
                    counter++;
                }
            }
            for (int w = 0; w < tmp.length; w++) {
                if (tmp[w][0].equals(array[i])) {
                    tmp[w][1] = String.valueOf(counter);
                    break;
                } else if (tmp[w][0] == "") {
                    tmp[w][0] = array[i];
                    tmp[w][1] = String.valueOf(counter);
                    break;
                }

            }
            counter = 0;
        }
        showArray2D(tmp);

        //System.out.println(tmp[3][0] == array[3]); //array[3]


    }


    private static String[] elementToLowerAndSort(String[] input) {
        for (int i = 0; i < input.length; i++) { //zamieniamy na małe
            input[i] = input[i].toLowerCase();
        }
        Arrays.sort(input);
        return input;
    }

    private static void showArray2D(String[][] input) {
        for (int w = 0; w < input.length; w++) {
            if (input[w][0] != "") {
                System.out.println(input[w][0] + " - " + input[w][1]);
            }
        }
    }
}