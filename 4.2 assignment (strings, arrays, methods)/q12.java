import java.util.Scanner;

public class q12 {

    public static boolean echecker(String[] array) {
        String stringChecker;
        for (int i = 0; i < array.length; i++) {
            stringChecker = array[i];
            for (int j = 0; j < stringChecker.length(); j++) {
                if (stringChecker.charAt(j) == 'e') {
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
    }
}
