import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] randomArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
        for (int i = 0; i <= 14; i++) {
            randomArray[i] = randomArray[i] * 25;
        }
        for (int i = 14; i >= 0; i--) {
            System.out.println(randomArray[i] + " ");
        }
        in.close();
    }
}
