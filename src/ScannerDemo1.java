import java.util.Scanner;
public class ScannerDemo1 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.print("请输入");
        while (true) {
            String src = input.nextLine();

            if (src.trim().equals("exit")) {
                return;
            }
            System.out.println("你输入的是" + src);
        }

    }


}
