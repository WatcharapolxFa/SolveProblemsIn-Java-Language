import java.util.Scanner;

public class Method {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // เรียกใช้ Display
        Display();

        // เรียกใช้ display
        String name = scanner.nextLine();
        display(name);

    }

    // แบบแรก
    static void Display() {
        // กลุ่มคำสั่งที่อยากให้ทำงาน
        System.out.print("โปรป้อนชื่อจริง ของนายท่าน = > ");

    }

    // แบบสอง
    static void display(String message) {
        // กลุ่มคำสั่งที่อยากให้ทำงาน
        System.out.println("ชื่อจริงของนายท่าน คือ > " + message + " ครับ / ค่ะ ");

    }
    // แบบสาม

}
