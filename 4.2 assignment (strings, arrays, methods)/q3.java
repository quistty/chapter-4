import java.util.Scanner;

public class q3 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double triangleArea = calcArea(); // stores the area of the triangle
        System.out.println("The area of the triangle is: " + triangleArea); // prints area
        in.close();
    }

    public static double calcArea() {
        // gathers the base and height, calculates the area, and returns it.
        Scanner in = new Scanner(System.in);
        System.out.println("Input the base of your triangle");
        double base = in.nextInt();
        System.out.println("Input the height of your triangle");
        double height = in.nextInt();
        in.close();
        double area = ((base * height) / 2);
        return area;

    }
}
