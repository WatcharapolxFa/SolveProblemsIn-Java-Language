import java.util.Scanner;

public class MinmaxLoops {
    private static int numbers;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxnumber = 0, minnumber = 0;
        while (true) {
            System.out.print("ป้อน ตัวเลข >> ");
            int number = scanner.nextInt();
            if (number < 0) {
                break;
            }
            if (number > maxnumber)
                maxnumber = number;

            if (number < minnumber)
                minnumber = number;

        }
        System.out.println("ค่ามากสุด >> " + maxnumber);
        System.out.println("ค่าน้อยสุด >> " + minnumber);
    }
}
