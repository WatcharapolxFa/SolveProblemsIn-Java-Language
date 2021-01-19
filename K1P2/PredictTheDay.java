import java.util.Scanner;

public class PredictTheDay {
    public static void main(String[] args) {
        System.out.print("Enter year (e.g., 2012): ");
        Scanner scanner = new Scanner(System.in);
        int years = scanner.nextInt();
        if (years <= 0) {
            System.out.println("Invalid year ,Please enter it again.");
            System.exit(1);
        }
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
        if (month < 1 || month > 12) {
            System.out.println("Invalid month,Please enter it again.");
            System.exit(1);
        }
        System.out.print("Enter the day of the month (1-31): ");
        int day = scanner.nextInt();
        validateDay(day, month, years);
        System.out.printf("Day of the week is %s", ToDays(zeller(years, month, day)));
    }

    public static int zeller(int year, int month, int day) {
        if (month == 1) {
            month = 13;
            year--;
        } else if (month == 2) {
            month = 14;
            year--;
        }
        int century = year / 100, yearOfCentury = year % 100;
        int h = day + yearOfCentury;
        h += 26 * (month + 1) / 10;
        h += yearOfCentury / 4;
        h += century / 4;
        h += century * 5;
        h %= 7;
        return h;
    }

    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void validateDay(int day, int month, int year) {
        if (day < 1) {
            System.out.println("Invalid day,Please enter it again.");
            System.exit(1);
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            if (day > 30) {
                System.out.println("Invalid day,Please enter it again.");
                System.exit(1);
            }
        } else if (month == 2) {
            if (isLeapYear(year)) {
                if (day > 29) {
                    System.out.println("Invalid day,Please enter it again.");
                    System.exit(1);
                }
            } else {
                if (day > 28) {
                    System.out.println("Invalid day,Please enter it again.");
                    System.exit(1);
                }
            }
        } else {
            if (day > 31) {
                System.out.println("Invalid day,Please enter it again.");
                System.exit(1);
            }
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