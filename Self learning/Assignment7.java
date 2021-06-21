import java.util.Scanner;

public class Assignment7 {
    public static void main(String[] args) {
        /*
         * โปรแกรมแลกธนบัตร ประกอบด้วย >> 1000 500 100 50 20 เช่น
         * >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> รับมา 3000 แบงค์ 1000 = 3 ใบ
         * >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> รับมา 3500 แบงค์ 1000 = 3 ใบ แบงค์ 500 = 1 ใบ
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("ป้อนจำนวนเงินที่คุณต้องการแลกธนบัตร >> ");
        int number = scanner.nextInt();
        if (number >= 1000) {
            System.out.println("แบงค์ 1000 บาท จำนวน > " + (number / 1000) + " ใบ");
            number %= 1000;
        }
        if (number >= 500) {
            System.out.println("แบงค์ 500 บาท จำนวน > " + (number / 500) + " ใบ");
            number %= 500;
        }
        if (number >= 100) {
            System.out.println("แบงค์ 100 บาท จำนวน > " + (number / 100) + " ใบ");
            number %= 100;
        }
        if (number >= 20) {
            System.out.println("แบงค์ 20 บาท จำนวน > " + (number / 20) + " ใบ");
            number %= 20;
        }

    }
}
