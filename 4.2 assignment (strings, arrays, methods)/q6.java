import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        int sum = 0;
        int count = 1;
        int lowestNum = 1001;
        int highestNum = 0;

        int[] intArray = new int[100];

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = (int) (1000 * Math.random() + 1);
        }
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
            sum += intArray[i];
            count++;
            if (intArray[i] < lowestNum) {
                lowestNum = intArray[i];
            }
            if (intArray[i] > highestNum) {
                highestNum = intArray[i];
            }
        }

        double average = (double) sum / intArray.length;

        System.out.println("Average of array elements: " + average);
        System.out.println("Lowest number in the array: " + lowestNum);
        System.out.println("Highest number in the array: " + highestNum);
    }
}
