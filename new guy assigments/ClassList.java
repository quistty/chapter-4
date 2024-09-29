import java.util.Scanner;

public class ClassList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for the number of students
        System.out.print("Enter the amount of students: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        // Initialize arrays to store student names and numbers
        String[] studentNames = new String[numStudents];
        String[] studentNumbers = new String[numStudents];

        // Loop to collect each student's name and number
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter student " + (i + 1) + " name: ");
            studentNames[i] = scanner.nextLine();
            
            System.out.print("Enter student " + (i + 1) + " Number: ");
            studentNumbers[i] = scanner.nextLine();
        }

        // Display the class list
        System.out.println("\nClass List:");
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Name: " + studentNames[i] + ", Number: " + studentNumbers[i]);
        }

        scanner.close();
    }
}