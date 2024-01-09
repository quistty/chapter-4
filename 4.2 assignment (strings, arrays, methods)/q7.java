import java.util.Scanner;

public class q7 {
    public static boolean duplicateChecker(int[] blackUncanny) {
        int[] duplicateArray = new int[blackUncanny.length];

        for (int i = 0; i < blackUncanny.length; i++) {
            for (int i2 = 0; i2 < duplicateArray.length; i2++) {
                if (duplicateArray[i2] == blackUncanny[i]) {
                    return true;
                }
            }
            duplicateArray[i] = blackUncanny[i];
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] array1 = { 1, 2, 3, 4, 5 };
        int[] array2 = { 11, 22, 33, 44, 55 };
        int[] array3 = { 7, 156, 36, 2, 9 };

        System.out.println(duplicateChecker(array1));
        System.out.println(duplicateChecker(array2));
        System.out.println(duplicateChecker(array3));
    }
}
