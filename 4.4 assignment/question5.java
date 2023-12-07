import java.util.Scanner;

public class question5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int noise;
        System.out.println("Input a decimal");
        noise = in.nextInt();
        if (noise < 40) {
            System.out.println("the noise level is quieter than a quiet room, which is pretty quiet!");
        } else if (noise == 40) {
            System.out.println("the noise level is equal to a quiet room");
        } else if (noise < 70) {
            System.out.println("the noise level is quieter than an alarm clock but quieter than a quiet room");
        } else if (noise == 70) {
            System.out.println("the noise level is euqal to an alarm clock");
        } else if (noise < 106) {
            System.out.println("the noise level is quieter than a gas lawnmower but louder than an alarm clock");
        } else if (noise == 106) {
            System.out.println("the noise level is equal to a gas lawnmower");
        } else if (noise < 130) {
            System.out.println("the noise level is qieter than a jackhammer but louder than a gas lawnmower");
        } else if (noise == 130) {
            System.out.println("the noise level is equal to a jackhammer");
        } else {
            System.out.println("the noise level is lowder than a jackhammer! that's very loud man");
        }
        in.close();
    }
}
