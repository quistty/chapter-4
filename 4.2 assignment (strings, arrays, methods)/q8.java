public class q8 {
    public static void divisibleBySeven(int[] passedArray) {
        // checks if any number in the array is divisible by 7
        for (int i = 0; i < passedArray.length; i++) {
            if ((passedArray[i] % 7) == 0) {
                System.out.print(passedArray[i] + " "); // prints all numbers divisible by 7
            }
        }
    }

    public static void main(String[] args) {
        int[] intArray = { 1, 2, 3, 4, 5, 6, 7 }; // hardcoded values
        divisibleBySeven(intArray); // 7
    }
}
