import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // values to find minimum, maximum and sum
        int sum = 0;
        int lowestNum = 1001;
        int highestNum = 0;

        int[] intArray = new int[100]; // defines array

        // puts random numbers in array
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = (int) (1000 * Math.random() + 1);
        }
        // stores total sum, lowest number and highest number
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
            sum += intArray[i];
            if (intArray[i] < lowestNum) {
                lowestNum = intArray[i];
            }
            if (intArray[i] > highestNum) {
                highestNum = intArray[i];
            }
        }

        double average = (double) sum / intArray.length; // calculates sum

        // prints stored values
        System.out.println("Average of array elements: " + average);
        System.out.println("Lowest number in the array: " + lowestNum);
        System.out.println("Highest number in the array: " + highestNum);
        in.close();
    }
}
