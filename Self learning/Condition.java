import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {
        // class data = new oop(Keyboad);
        Scanner scanner = new Scanner(System.in);
        // In Put
        System.out.print("ป้อนชื่อของท่าน : ");
        String name = scanner.nextLine();
        // In Put
        System.out.print("ป้อนเบอร์โทรศัพท์: ");
        String call = scanner.nextLine();
        // Out Put
        System.out.println("ชื่อของท่าน : " + name);
        System.out.println("เบอร์โทรศัพท์ของท่าน : " + call);
        // if (age >= 15) {
        // System.out.println("นาย / นางสาว : " + age);
        // }
        // System.out.print("จบโปรแกรม ");
    }

}
