import java.util.*;

public class a1problem1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int intArray[][] = new int[10][10];
        boolean occupied[][] = new boolean[10][10];
        Random random = new Random();

        // Randomly place numbers from 1 to 100 in the grid
        for (int i = 0; i < 100; i++) {
            int row, col;
            // Ensure no repeated locations
            do {
                row = random.nextInt(10);  
                col = random.nextInt(10);  
            } while (occupied[row][col]);  // Check if the position is already occupied to make sure there are no duplicates

            intArray[row][col] = i + 1;  // Place numbers from 1 to 100 in random locations
            occupied[row][col] = true;   // Mark the position as occupied
        }

        // User input and guessing the correct location
        for (int i = 1; i <= 100; i++) {  // Loop through numbers 1 to 100
            boolean found = false;        // Reset for each number
            do {
                // ask the user for the location of displayed number
                System.out.println("Enter the row for the number: " + i);
                int userRow = in.nextInt() - 1;
                System.out.println("Enter the column for the number: " + i);
                int userCol = in.nextInt() - 1;

                // Check if the user's guess is correct
                if (i == intArray[userRow][userCol]) {
                    System.out.println("True!");
                    intArray[userRow][userCol] = 0;
                    for (int[] row : intArray) {
                        for (int num : row) {
                            System.out.print(num + " ");
                    }
                        System.out.println();
                    }
                    found = true;  // User found the correct number
                } else {
                    System.out.println("Incorrect, try again");
                }
            } while (!found);  // Keep asking until the user finds the correct number
        }

        in.close();  // Close the scanner
    }
}
