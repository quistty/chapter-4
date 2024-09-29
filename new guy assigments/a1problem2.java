import java.util.Scanner;
// JUST TO NOTE, ITS ALWAYS [ROW][COL]!
public class a1problem2 {
    public static int n;
    public static int intArray[][] = new int[n][n];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("Enter an odd number greater than 1");
            n = in.nextInt();
        } while (n % 2 == 0 || n == 1);
        
        int row = (n-1)/2;
        int col = (n-1)/2;
        int i = 0;
        int patRot = 1;
        while (i < n*n){
            down(i, )
            right;
            patRot++;
            up 
            if (i + patRot > n*n){
                left(i, patRot - 1);
            }
            left
            patRot++;
        }
        
            // go right up left down and keep repeating that pattern
        
    }
    public static void down(int currentNum, int patRot){
        for (int i = 0; i < patRot; i++){
            
        }
    }
    public static void right(int currentNum, int patRot){
        
    }
    public static void up(int currentNum, int patRot){
        
    }
    public static void left(int currentNum, int patRot){
        
    }
    // create four methods that takes the current number we're on, and the amount to move by and increment the thing
}
