import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ป้อนอายุของนาย ท่าน : ");
        int age = scanner.nextInt();
        if (age >= 15) {
            System.out.println("นาย / นางสาว : " + age);
        }
        System.out.print("จบโปรแกรม ");
    }

}
