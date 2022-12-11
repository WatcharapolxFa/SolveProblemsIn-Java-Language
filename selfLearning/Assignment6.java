import java.util.Scanner;

public class Assignment6 {
    public static void main(String[] args) {
        /*
         * เงื่อนไข น้อยกว่า 18 ต่ำกว่าเกรณฑ์ 18.5 - 22.9 สมส่วน 23.0 - 24.9 น้ำหนักเกิน
         * 25.0 - 29.9 โรคอ้วน มากกว่า 30.0 โรคอ้วนระดับอันตราย
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("ป้อนน้ำหนักของคุณ : ");
        double weight = scanner.nextDouble();
        System.out.print("ป้อนส่วงสูงของคุณ : ");
        double height = scanner.nextDouble();
        height /= 100;
        double sum = weight / (height * height);
        if (sum <= 18) {
            System.out.print("ค่า BMI ของคุณ >>> " + sum + "  ต่ำกว่าเกรณฑ์");

        } else if (sum >= 18.5 && sum <= 22.9) {
            System.out.print("ค่า BMI ของคุณ >>> " + sum + "  สมส่วน");
        } else if (sum >= 23.0 && sum <= 24.9) {
            System.out.print("ค่า BMI ของคุณ >>> " + sum + "  น้ำหนักเกิน");
        } else if (sum >= 25.0 && sum <= 29.0) {
            System.out.print("ค่า BMI ของคุณ >>> " + sum + "  โรคอ้วน");
        } else {
            System.out.print("ค่า BMI ของคุณ >>> " + sum + "  โรคอ้วนระดับอันตราย");
        }
    }
}
