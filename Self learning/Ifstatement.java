import java.util.Scanner;

public class Ifstatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ป้อนอายุของคุณ : ");
        int age = scanner.nextInt();

        if (age >= 15) {
            System.out.println("คำนำหน้าของคุณคือ นาย/นางสาว ");
        } else {
            System.out.println("คำนำหน้าของคุณคือ เด็กชาย/เด็กหญิง ");
        }
    }
}
