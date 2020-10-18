import java.util.Random;
import java.util.Scanner;
public class RandomDemo1 {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt(11)+1;
        Scanner src = new Scanner(System.in);
        for(int time = 1;;time++) {
            System.out.println("请猜1~10之间的数字");
            int i = src.nextInt();
            if (i < num) {
                System.out.println("你猜的数字有点小哟");
            } else if (i > num) {
                System.out.println("你猜的数字大了点");
            } else {
                System.out.println("猜得真准");

            }

        }
    }
}