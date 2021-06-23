import java.util.Scanner;

public class InputMultiply {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("ป้อนแม่สูตรคูณเริ่มต้น  = ");
        int start = scanner.nextInt();
        System.out.print("ป้อนแม่สูตรคูณสุดท้าย = ");
        int stop = scanner.nextInt();

        for (int m = start; m <= stop; m++) {
            System.out.println("แม่ที่  = " + m);
            for (int x = 1; x <= 12; x++) {
                System.out.println(m + " X " + x + " = " + (m * x));

            }
        }

    }

}
