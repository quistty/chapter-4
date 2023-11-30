import java.util.Scanner;

public class exerciseFour {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double width, length, area;
        System.out.println("How many metres is the width of the room?");
        width = in.nextDouble();
        System.out.println("How many metres is the length of the room?");
        length = in.nextDouble();
        area = width * length;
        System.out.println("The area of your room is: " + area + " square meters m");


        in.close();
    }
}
