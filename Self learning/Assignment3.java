
import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ป้อนตัวเลขที่คุณต้องการหา : ");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + " >> เป็นเลขคู๋");
        } else {
            System.out.println(number + " >> เป็นเลขคี่");
        }

    }

}
