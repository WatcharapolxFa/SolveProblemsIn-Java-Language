import java.util.Scanner;

public class Assignment5 {
    public static void main(String[] args) {
        // แปลง พ.ศ. เป็น ค.ศ.
        Scanner scanner = new Scanner(System.in);
        System.out.print("ป้อนปี พ.ศ. ของคุณ :");
        int number = scanner.nextInt();
        int sum = number - 543;
        System.out.println("ปี ค.ศ.ของคุณ คือ >> " + sum);

    }

}
