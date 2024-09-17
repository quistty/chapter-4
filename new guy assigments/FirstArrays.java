import java.util.Random;

public class FirstArrays {
    public static void main(String[] args) {
        // This array can store 20 integer values
        int[] numbers = new int[20];

        // Assign a value of 8 to the 8th element (index 7 since arrays are 0-indexed)
        numbers[7] = 8;

        // Output the 8th element
        System.out.println("The 8th element is: " + numbers[7]);

        // Create a Random object to generate random numbers
        Random rnd = new Random();

        // Populate the array with random numbers between 1 and 20
        for (int counter = 0; counter < numbers.length; counter++) {
            numbers[counter] = rnd.nextInt(20) + 1;
        }

        // Output the array values
        System.out.println("Array values:");
        for (int counter = 0; counter < numbers.length; counter++) {
            System.out.print(numbers[counter] + " ");
        }
    }
}