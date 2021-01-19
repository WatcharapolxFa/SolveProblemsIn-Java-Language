import java.util.Scanner;

class Findfuturedates {
    public static void main(String[] args) {
        int day, Next;
        Scanner inputs = new Scanner(System.in);

        while (true) {
            System.out.print("Enter today's day: ");
            day = inputs.nextInt();
            if (day < 0 || day > 6) {
                System.out.println("Please enter numbers from 0-6\n");
                continue;
            }

            System.out.print("Enter the number of days elapsed since today: ");
            Next = inputs.nextInt();
            if (Next <= 0) {
                System.out.println("Invalid future days Please enter numbers from > 0 \n");
                continue;
            }

            System.out.printf("Today is %s and the future day is %s\n\n", ToDays(day), ToDays((day + Next) % 7));
        }
    }

    public static String ToDays(int number) {
        String day;

        switch (number) {
            case 0:
                day = "Sunday";
                break;
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            default:
                day = "UNIDENTIFIED";
        }

        return day;
    }

}
