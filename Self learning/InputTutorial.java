import java.util.Scanner;

public class InputTutorial {
    public static void main(String[] args) {

        // Next or NextLine

        // NextLine
        Scanner scanner = new Scanner(System.in);
        System.out.print("ป้อน ชื่อ :");
        String name = scanner.nextLine(); // Input by string
        System.out.println("ชื่อของคุณ คือ " + name);
        System.out.print("ป้อน ปีเกิด :");
        // System.out.println("ชื่อเล่นของคุณ คือ " + sc);

        int sum;
        int year = scanner.nextInt(); // Input by Integer

        sum = 2563 - year;
        System.out.println("อายุของคุณ : " + sum + "ปี");

        // Next

        // System.out.println((num/2==0)? num + "is even":num +"is odd");

        System.out.print("ป้อน ชื่อเล่น :");
        String names = scanner.next(); // Input by string
        System.out.println("ชื่อเล่นของคุณ คือ " + names);
    }
}
