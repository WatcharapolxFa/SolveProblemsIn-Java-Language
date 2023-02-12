import java.util.Scanner; // เรียกใช้ไลบารี่ สำหรับการรับค่า 

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//สร้างตัวรับค่าจากผู้ใช้
        System.out.print("Enter number : ");//แสดงคำออกทาง console
        int num = input.nextInt(); //ตัวแปร num เก็บค่า เป็น Int

        if(num >= 4)// ถ้า ค่าที่รับมาจากผู้ใช้มากว่าหรือเท่ากับ 4 ทำตามเงื่อนไขนี้
        {
            Pattern p1 = new Pattern(num);// สร้าง Object ขี้นมา
            p1.display();
        }
        else//ไม่ใช่ทำตามเงื่อนไขนี้
        {
            System.err.println("Please Enter Number 4 or more."); 
        }

    }
}