public class Pattern {
    private int num;

    public Pattern() { // Constructor ว่าง

    }

    public Pattern(int newNum) { // Constructor ที่ใช้
        num = newNum;
    }

    public void display() { // ฟังก์ชันในคลาส สำหรับแสดงภาพตามค่าที่ใส่ใน Constructor
        int x = 1; //นับบรรทัดส่วนล่าง
        int space = num - 2;//ช่องว่างบรรทัดแรกจะ ลบ 2 เสมอ num ค่าที่รัับมา num = 4 ช่่องว่าง  = 2 
        int s1 = space;//พื่นที่ว่างส่วงบน  2
        int s2 = space;//พื่นที่ว่างส่วนล่าง 2 
        for (int i = 1; i <= num + 1; i++) {// i = 1 เริ่มที่ 1 จะทำงานเท่ากับค่าที่รับมา + 1 = 5 เอาไว้ปริ้นบรรทัด
            //num*2 - 2 ทำให้ปริ้นเท่ากัน
            if (i < num) {// รอบแรก i = 1 num = 4 
                for (int j = 0; j < s1; j++) { // ปริ้นช่องว่าง 
                    System.out.print("  ");
                }
                s1--;
                for (int j = 0; j < (i * 2) - 1; j++) {
                    System.out.print("* "); // ปริ้น *
                }
            } else {
                for (int j = 0; j < s2; j++) {
                    System.out.print("  ");
                }
                s2--;
                for (int j = 0; j < (x * 2) - 1; j++) {
                    System.out.print("* ");
                }
                x++;
            } 
            System.out.println("");
        }
    }
}