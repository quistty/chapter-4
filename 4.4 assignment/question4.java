import java.util.Scanner;

public class question4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sides;
        System.out.println("How many sides does your shape have");
        sides = in.nextInt();
        if (sides == 3) {
            System.out.println("Your shape is a triangle");
        } else if (sides == 4) {
            System.out.println("Your shape is a rectangle");
        } else if (sides == 5) {
            System.out.println("Your shape is a pentagon");
        } else if (sides == 6) {
            System.out.println("Your shape is a hexagon");
        } else if (sides == 7) {
            System.out.println("Your shape is a heptagon");
        } else if (sides == 8) {
            System.out.println("Your shape is a octogon");
        } else if (sides == 9) {
            System.out.println("Your shape is a nonagon");
        } else if (sides == 10) {
            System.out.println("Your shape is a decagon");
        } else if (sides > 10) {
            System.out.println("Your shape is too large!");
        } else {
            System.out.println("That is not a shape!");
        }
        in.close();
    }
}
