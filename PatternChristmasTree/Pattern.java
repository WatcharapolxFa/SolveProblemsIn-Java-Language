public class Pattern {
    private int num;

    public Pattern() { // Constructor ว่าง

    }

    public Pattern(int newNum) { // Constructor ที่ใช้
        num = newNum;
    }

    public void display() { // ฟังก์ชันในคลาส สำหรับแสดงภาพตามค่าที่ใส่ใน Constructor
        int x = 1;
        int space = num - 2;
        int s1 = space;
        int s2 = space;
        for (int i = 1; i <= num + 1; i++) {
            if (i < num) {
                for (int j = 0; j < s1; j++) {
                    System.out.print("  ");
                }
                s1--;
                for (int j = 0; j < (i * 2) - 1; j++) {
                    System.out.print("* ");
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