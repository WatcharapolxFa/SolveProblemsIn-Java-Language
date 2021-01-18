import java.util.Scanner;

public class InputTutorial {
    public static void main(String[] args) {

        // Next or NextLine

        // NextLine
        Scanner sc = new Scanner(System.in);
        System.out.print("ป้อน ชื่อ :");
        String name = sc.nextLine(); // Input by string
        System.out.println("ชื่อของคุณ คือ " + name);
        System.out.print("ป้อน ปีเกิด :");

        int sum;
        int year = sc.nextInt(); // Input by Integer

        sum = 2563 - year;
        System.out.println("อายุของคุณ : " + sum + "ปี");

        // Next

        System.out.print("ป้อน ชื่อเล่น :");
        String names = sc.next(); // Input by string
        System.out.println("ชื่อเล่นของคุณ คือ " + names);
    }
}
