import java.util.Scanner;

public class Assignment8 {
    public static void main(String[] args) {
        // แปลง อุณหภูมิ C ไป F F ไป C
        Scanner scanner = new Scanner(System.in);
        System.out.print("คุณต้องการแปลงจาก (c)ไป (f) กด >> 1 << || (f) ไป (c) กด >> 2 <<  : ");
        int nub = scanner.nextInt();
        if (nub == 1) {
            System.out.print("ป้อนอุณหภูมิที่ต้องการแปลง(c) : >> ");
            float temp = scanner.nextFloat();
            float sum = (temp * 9 / 5) + 32;
            System.out.println(temp + "( c ) แปลงเป็น ( f ) >> " + sum);
            System.out.println("จบการทำงาน");
        } else if (nub == 2) {
            System.out.print("ป้อนอุณหภูมิที่ต้องการแปลง(f) : >> ");
            float temp2 = scanner.nextFloat();
            float sum2 = (temp2 - 32) * 5 / 9;
            System.out.println(temp2 + "( f ) แปลงเป็น ( c ) >> " + sum2);
            System.out.println("จบการทำงาน");
        } else {
            System.out.print("ป้อนตัวเลขให้ถูกต้องด้วยครับ !!!!!  ");
            System.out.println("จบการทำงาน");
        }

    }
}
