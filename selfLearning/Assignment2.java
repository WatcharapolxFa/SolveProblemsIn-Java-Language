import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        // เปรียบเทียบค่าตัวเลข 2 จำนวน
        Scanner scanner = new Scanner(System.in);
        System.out.print("ป้อนชื่อตัวเลขที่ 1  = ");
        int number1 = scanner.nextInt();
        System.out.print("ป้อนชื่อตัวเลขที่ 2 = ");
        int number2 = scanner.nextInt();
        if (number1 > number2) {
            System.out.println(number1 + " มากกว่า " + number2);

        } else if (number1 < number2) {
            System.out.println(number2 + " มากกว่า " + number1);
        } else {
            System.out.println(number1 + " เท่ากับ " + number2);
        }

    }
}
