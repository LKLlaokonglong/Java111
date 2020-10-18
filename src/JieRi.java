public class JieRi {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 3; i++) {
            System.out.println(" ");
            for (int m = 1; m <= 35; m++) {
                if (m % 5 != 0) {
                    System.out.println("正在给第" + i + "组的第" + m + "个同学发橘子");
                    count++;
                }


            }


        }
        System.out.println("一共发了" + count + "个橘子");
    }


}
