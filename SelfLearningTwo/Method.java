import java.util.Scanner;

public class Method {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // เรียกใช้ Display
        Display();

        // เรียกใช้ display
        String name = scanner.nextLine();
        display(name);

        // เรียกใช้ Ip
        String ip = Ip();
        System.out.println("เลข Ip ของท่านคือ >>> " + ip);

        // เรียกใช้ Ip && Bonus

        System.out.print("เงินเดือนของท่าน >>> ");
        double salary = scanner.nextDouble();
        System.out.print("เงินทั้งหมดหลังจากรวมค่า Bonus >>> " + Bonus(salary) + " ฿ ");

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
    static String Ip() {
        return "192.0.0.1";
    }

    // แบบสามเวอร์ชั่น 2

    static Double Bonus(Double salary) {
        Double salarys = salary;
        double bonus = 0.1;
        salary *= bonus;
        double sum = salary + salarys;
        return sum;
    }

}
