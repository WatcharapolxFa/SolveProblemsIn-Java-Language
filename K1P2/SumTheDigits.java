package K1P2;

import java.util.Scanner;

class SumTheDigits {
    public static void main(String[] args) {
        int number;
        System.out.print("Input number : ");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        if (number >= 0 && number <= 1000) {
            if (number < 10) {

                int sumnumbers = number;
                System.out.println("Sum ans : " + sumnumbers);
            }
            if (number >= 10 && number <= 99) {
                int sumnumberss;
                sumnumberss = ((number % 10) + (number / 10));
                System.out.println("Sum ans : " + sumnumberss);
            }
            if (number >= 100 && number <= 999) {
                int sumnumbersss;
                sumnumbersss = (((number % 10) + ((number / 10) % 10) + (number / 100)));
                System.out.println("Sum ans : " + sumnumbersss);
            }
            if (number == 1000) {
                System.out.println("Sum ans : " + 1);
            }

        }
    }

}