import java.util.Scanner;

public class exerciseSeven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double mileage, mileageKilometres;

        System.out.println("What is the mileage of your car?");
        mileage = in.nextDouble();

        mileageKilometres = mileage * 1.61;
        
        System.out.println("Your mileage is kilometres is: " + mileageKilometres);

        in.close(); // used to not have a resource leak
    }
}
