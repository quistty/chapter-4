import java.util.Scanner;

public class q12 {

    public static boolean echecker(String[] array) {
        for (int i = 0; i < array.length; i++) { // while i is less than the length of the array, make the stringchecker
                                                 // equal to the string with the same index as i
            String stringChecker = array[i];
            boolean count = false;

            for (int j = 0; j < stringChecker.length(); j++) {
                // checks for e and exits checking for e for the rest of the word
                if (stringChecker.charAt(j) == 'e') {
                    count = true;
                    break;
                }
            }

            // if e isnt found in a string it will return false
            if (!count) {
                return false;
            }
        }

        // happens after all words in the string have been looked at, and it returns
        // true
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] array = { "bobbie", "nobb", "black uncanny", "defenestration",
                "pneumonoultramicroscopicsilicovolcanoconiosis" };
        System.out.println(echecker(array)); // false

        String[] array2 = { "bobe", "nobbe", "black uncannye" };
        System.out.println(echecker(array2)); // true

        in.close();
    }
}
