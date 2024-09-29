import java.util.Scanner;

public class a1problem2 {
    public static int n;
    public static int intArray[][]; // array storring prints
    public static int i = 1; // Number printed

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Ask the user for an odd number greater than 1
        do {
            System.out.println("Enter an odd number greater than 1:");
            n = in.nextInt();
        } while (n % 2 == 0 || n == 1);

        intArray = new int[n][n];  // Initialize the array with user size times itself
        // makes the spiral start 
        int row = (n - 1)/2;
        int col = (n - 1) / 2;
        int patRot = 1;  // Number of steps in the current increment  

        // Initialize the center of the array
        intArray[row][col] = i++;
        
        // Continue filling the spiral pattern
        while (i <= n * n) {
            row = moveDown(row, col, patRot);
            col = moveRight(row, col, patRot);
            patRot++;  // Increment pattern rotation after down-right
            row = moveUp(row, col, patRot);
            col = moveLeft(row, col, patRot);
            patRot++;  // Increment pattern rotation after up-left
        }

        // Display the array at the end
        end();
    }

    // Move down in spiral
    public static int moveDown(int row, int col, int patRot) {
        for (int j = 0; j < patRot && i <= n * n; j++) { // makes sure it does not exceed the amouunt of steps for the current pattern
            row++; // add new number in the spiral
            if (row < n) {
                intArray[row][col] = i++;
            }
        }
        return row;  // Return updated row after moving down
    }

    // Move right in spiral
    public static int moveRight(int row, int col, int patRot) {
        for (int j = 0; j < patRot && i <= n * n; j++) { // makes sure it does not exceed the amouunt of steps for the current pattern
            col++; // add new number in the spiral
            if (col < n) {
                intArray[row][col] = i++;
            }
        }
        return col;  // Return updated col after moving right
    }

    // Move up in spiral
    public static int moveUp(int row, int col, int patRot) {
        for (int j = 0; j < patRot && i <= n * n; j++) { // makes sure it does not exceed the amouunt of steps for the current pattern
            row--; // add new number in the spiral
            if (row >= 0) {
                intArray[row][col] = i++;
            }
        }
        return row;  // Return updated row after moving up
    }

    // Move left in spiral
    public static int moveLeft(int row, int col, int patRot) {
        for (int j = 0; j < patRot && i <= n * n; j++) { // makes sure it does not exceed the amouunt of steps for the current pattern
            col--; // add new number in the spiral
            if (col >= 0) {
                intArray[row][col] = i++;
            }
        }
        return col;  // Return updated col after moving left
    }

    // End and print the array
    public static void end() {
        for (int[] row : intArray) {
            for (int num : row) {
                System.out.print(num + "\t");  // Tab for better formatting
            }
            System.out.println();
        }
        System.exit(0);  // Exit the program after printing
    }
}
