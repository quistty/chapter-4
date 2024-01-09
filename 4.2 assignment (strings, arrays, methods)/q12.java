import java.util.Scanner;

public class q12 {

    public static boolean echecker(String[] array) {
        String stringChecker;
        boolean hasE = false;
        int counter = 0;
        boolean counterTrueOrFalse;
        for (int i = 0; i < array.length; i++) { // while i is less than the length of the array, make the stringchecker
                                                 // equal to the string with the same index as i
            stringChecker = array[i];
            counterTrueOrFalse = false;
            for (int j = 0; j < stringChecker.length(); j++) { // gets the string
                System.out.println(counter + ": What is this");
                System.out.println(counterTrueOrFalse + ": counter true or false");
                if (stringChecker.charAt(j) == 'e') {
                    System.out.println("AAAAAAAAAAAAAAAAAA");
                    counter++;
                    counterTrueOrFalse = true;
                }
                if ((j == stringChecker.length() - 1) && (counter == 0)) {
                    counterTrueOrFalse = false;
                }
                if (counterTrueOrFalse == true) { // doesnt work bc if u have a word with more than 1 e, it adds 1
                    return true;
                }
                if (counterTrueOrFalse == false) {
                    return false;
                }
            }
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] array = { "bobbie", "nobb", "black uncanny", "defenestration",
                "pneumonoultramicroscopicsilicovolcanoconiosis" };
        System.out.println(echecker(array)); // true
        String[] array2 = { "bobe", "nobbe", "black uncannye" };
        System.out.println(echecker(array2)); // false
        in.close();
    }
}
