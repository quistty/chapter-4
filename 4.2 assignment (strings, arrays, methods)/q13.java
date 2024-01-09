import java.util.Scanner;

public class q12 {

    public static boolean echecker(String[] array) {
        String stringChecker;
        for (int i = 0; i < array.length; i++) { // while i is less than the length of the array, make the stringchecker
                                                 // equal to the i equvalent in the array
            boolean hasE = false;
            stringChecker = array[i];
            int counter = 0; // Reset counter for the number of times a string has e
            for (int j = 0; j < stringChecker.length(); j++) {

                if (stringChecker.charAt(j) == 'e') {
                    counter++;
                }
                if (counter >= stringChecker.length()) {
                    System.out.println("String with all 'e's: " + stringChecker);
                    return true;
                }
            }

        }
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] array = { "bobbie", "nobb", "black uncanny", "defenestration",
                "pneumonoultramicroscopicsilicovolcanoconiosis" };
        System.out.println(echecker(array));
        String[] array2 = { "bob", "nobb", "black uncanny" };
        System.out.println(echecker(array2));
        in.close();
    }
}
