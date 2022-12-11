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
        // In Put
        System.out.print("ปีเกิดของท่าน(พ.ศ.): ");
        int year = scanner.nextInt();

        int age = 2564 - year;
        // Out Put
        System.out.println("ชื่อของท่าน : " + name);
        System.out.println("เบอร์โทรศัพท์ของท่าน : " + call);
        System.out.println("ปีเกิดของท่าน(พ.ศ.): " + year);
        System.out.println("อายุของท่าน: " + age);

    }

}

// if (age >= 15) {
// System.out.println("นาย / นางสาว : " + age);
// }
// System.out.print("จบโปรแกรม ");