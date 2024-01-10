import java.math.BigInteger;

public class q8 {
    public static int[] divisibleBySeven(int[] passedArray) {
        int counterInputted = 0;
        int[] divisibleBy7Array = new int[1];
        // checks if any number in the array is divisible by 7
        for (int i = 0; i < passedArray.length; i++) {
            if ((passedArray[i] % 7) == 0) {
                divisibleBy7Array[counterInputted] = passedArray[i];
                counterInputted++;
            }
        }
        return divisibleBy7Array;
    }

    public static void main(String[] args) {
        int[] intArray = { 1, 2, 3, 4, 5, 6, 7 }; // hardcoded values
        int[] divisibleArray = divisibleBySeven(intArray); // 7
        for (int i = 0; i < divisibleArray.length; i++) { // prints all numbers divisible by 7
            System.out.print(divisibleArray[i] + " ");
        }
    }
}
