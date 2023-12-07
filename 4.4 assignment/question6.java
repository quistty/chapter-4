import java.util.Scanner;

public class question6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the length of side 1:");
        double side1 = in.nextDouble();

        System.out.println("Enter the length of side 2:");
        double side2 = in.nextDouble();

        System.out.println("Enter the length of side 3:");
        double side3 = in.nextDouble();

        in.close();

        if (side1 == side2 && side2 == side3) {
            System.out.println("The triangle is equilateral.");
        } else if (side1 == side2 || side2 == side3 || side1 == side3) {
            System.out.println("The triangle is isosceles.");
        } else {
            System.out.println("The triangle is scalene.");
        }
    }
}
