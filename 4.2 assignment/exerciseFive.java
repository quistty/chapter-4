import java.util.Scanner;

public class exerciseFive {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double width, length, area, areaInAcres;
        System.out.println("How many feet long is the width of the field?");
        width = in.nextDouble();
        System.out.println("How many feet long is the length of the room?");
        length = in.nextDouble();
        area = width * length;
        areaInAcres = area / 43560;
        System.out.println("The area of your field is: " + areaInAcres + " acres");


        in.close();
    }
}
