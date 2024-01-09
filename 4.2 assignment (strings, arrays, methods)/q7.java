import java.util.Scanner;

public class q7 {
    public static boolean duplicateChecker(int[] blackUncanny) {
        // duplicates the array
        int[] duplicateArray = new int[blackUncanny.length];

        // checkes each value in the array if it occurs again in the duplicated array
        for (int i = 0; i < blackUncanny.length; i++) {
            for (int i2 = 0; i2 < duplicateArray.length; i2++) {
                if (duplicateArray[i2] == blackUncanny[i]) {
                    return true; // returns true if there are duplicates
                }
            }
            duplicateArray[i] = blackUncanny[i];
        }
        return false; // no duplicates
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] array1 = { 1, 2, 3, 4, 5 };
        int[] array2 = { 11, 22, 33, 44, 55 };
        int[] array3 = { 7, 156, 36, 2, 7 };

        System.out.println(duplicateChecker(array1)); // false
        System.out.println(duplicateChecker(array2)); // false
        System.out.println(duplicateChecker(array3)); // true
        in.close();
    }
}
