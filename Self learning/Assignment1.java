import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ป้อนน้ำหนักของท่าน(กิโลกรัม) :      ");
        double weight = scanner.nextDouble();
        System.out.print("ป้อนส่วนสูงของท่าน(เมตร) :         ");
        double height = scanner.nextDouble();
        // height /= 100;
        double bmi = weight / (height * height);
        System.out.println("น้ำหนักของท่าน(กิโลกรัม) :" + weight + ("กิโลกรัม"));
        System.out.println("ส่วนสูงของท่าน(เมตร) :" + height + ("เมตร"));
        System.out.println("ค่า BMI ของท่าน :" + bmi);
    }

}
