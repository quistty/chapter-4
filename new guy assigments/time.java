import java.util.Scanner;
import java.util.Random;

public class time {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();
            int [][] intArray = int[10][10];
            for (int row  = 0; row < 10; row++){
                for (int col = 0; col < 10; col++){
                    intArray[row][col] = rnd.nextint(100) + 1;
                    system.out.println(intArray[row][col] + "\t");
                }
            }
            for int 
        in.close();
    }

}
