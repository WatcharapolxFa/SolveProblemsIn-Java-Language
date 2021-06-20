import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ป้อนตัวเลขที่คุณต้องการหา :  ");
        int number = scanner.nextInt();
        String sum = "";
        sum = (number % 2 == 0) ? number + " >> เป็นเลขคู่" : number + " >> เป็นเลขคี่";
        System.out.println(sum);

    }
}
