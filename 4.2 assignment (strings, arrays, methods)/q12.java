import java.util.Scanner;

public class q12 {

    public static boolean echecker(String[] array) {
        String stringChecker;
        boolean hasE = false;
        for (int i = 0; i < array.length; i++) { // while i is less than the length of the array, make the stringchecker
                                                 // equal to the i equvalent in the array
            stringChecker = array[i];
            for (int j = 0; j < stringChecker.length(); j++) {
                if (stringChecker.charAt(j) == 'e') {
                    hasE = true;
                    break;
                }
            }
        }

        if (!hasE) {
            return false;
        } else {
            return true;
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] array = { "bobbie", "nobb", "black uncanny", "defenestration",
                "pneumonoultramicroscopicsilicovolcanoconiosis" };
        System.out.println(echecker(array)); // true
        String[] array2 = { "bob", "nobb", "black uncanny" };
        System.out.println(echecker(array2)); // false
        in.close();
    }
}
