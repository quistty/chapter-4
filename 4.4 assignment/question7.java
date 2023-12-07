import java.util.Scanner;

public class question7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a letter grade:");
        String letterGrade = in.nextLine().toUpperCase();

        double gradePoints;

        switch (letterGrade) {
            case "A+":
                gradePoints = 4.0;
                System.err.println("Your grade is " + gradePoints);
                break;
            case "A":
                gradePoints = 4.0;
                System.err.println("Your grade is " + gradePoints);
                break;
            case "A-":
                gradePoints = 3.7;
                System.err.println("Your grade is " + gradePoints);
                break;
            case "B+":
                gradePoints = 3.3;
                System.err.println("Your grade is " + gradePoints);
                break;
            case "B":
                gradePoints = 3.0;
                System.err.println("Your grade is " + gradePoints);
                break;
            case "B-":
                gradePoints = 2.7;
                System.err.println("Your grade is " + gradePoints);
                break;
            case "C+":
                gradePoints = 2.3;
                System.err.println("Your grade is " + gradePoints);
                break;
            case "C":
                gradePoints = 2.0;
                System.err.println("Your grade is " + gradePoints);
                break;
            case "C-":
                gradePoints = 1.7;
                System.err.println("Your grade is " + gradePoints);
                break;
            case "D+":
                gradePoints = 1.3;
                System.err.println("Your grade is " + gradePoints);
                break;
            case "D":
                gradePoints = 1.0;
                System.err.println("Your grade is " + gradePoints);
                break;
            case "F":
                gradePoints = 0;
                System.err.println("Your grade is " + gradePoints);
                break;
        }

        in.close();
    }
}
