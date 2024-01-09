import java.util.Scanner;

public class q8 {
    public static void divisibleBySeven(int[] passedArray) {
        for (int i = 0; i < passedArray.length; i++) {
            if ((passedArray[i] % 7) == 0) {
                System.out.print(passedArray[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] intArray = { 1, 2, 3, 4, 5, 6, 7 };
        divisibleBySeven(intArray);
    }
}
