import java.util.Scanner;

public class InputSummationLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.print("ป้อนตัวเลขที่คุณต้องการบวก  : >> ");
            int count = scanner.nextInt();

            if (count < 0) {
                break;
            }
            sum += count;

        }
        System.out.print("ผลรวมการบวก   : >> " + sum);

    }
}
