import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ป้อนเลขเดือน : ");
        int month = scanner.nextInt();
        String name;

        switch (month) {
            case 1:
                name = "January";
                break;
            case 2:
                name = "February";
                break;
            case 3:
                name = "March";
                break;
            case 4:
                name = "April";
                break;
            case 5:
                name = "May";
                break;
            case 6:
                name = "June";
                break;
            case 7:
                name = "July";
                break;
            case 8:
                name = "August";
                break;
            case 9:
                name = "September";
                break;
            case 10:
                name = "October";
                break;
            case 11:
                name = "November";
                break;
            case 12:
                name = "December";
                break;

            default:
                name = "ป้อนข้อมูลเป็นตัวเลขให้ถูกต้องนะครับ";
                break;
        }
        System.out.println(month + " >> เป็นภาษาอังกฤษคือ >> " + name);

    }

}
