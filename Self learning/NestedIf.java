import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ป้อนอายุของคุณ : ");
        int age = scanner.nextInt();
        if (age <= 15) {
            System.out.println("ม.ต้น");
            if (age == 15) {
                System.out.println("ม.3");
            } else if (age == 14) {
                System.out.println("ม.2");
            } else if (age == 13) {
                System.out.println("ม.1");
            }
        } else {
            System.out.println("ม.ปลาย");
            if (age == 16) {
                System.out.println("ม.4");
            } else if (age == 17) {
                System.out.println("ม.5");
            } else if (age == 18) {
                System.out.println("ม.6");
            }
        }
    }
}
