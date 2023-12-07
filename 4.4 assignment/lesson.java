import java.util.Scanner;

public class lesson {
    public static void main(String[] args) {
        double sumMarks = 0;
        double average = 0;
        int numMarks = 0;

        Scanner in = new Scanner(System.in);

        System.out.println("Please enter a mark");
        double mark = in.nextDouble();
        while ((mark >= 0) && (mark <= 100)) {
            sumMarks += mark;
            numMarks++;
            System.out.println("Please enter a mark");
            mark = in.nextDouble();
        }
        if (numMarks != 0) {
            average = sumMarks / numMarks;
        }
        System.out.println("Your average is: " + average);

        in.close();
    }

}
