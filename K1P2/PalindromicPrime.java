import java.util.ArrayList;
import java.util.List;

public class PalindromicPrime {
    public static void main(String[] args) {
        List ListPrime = new ArrayList<>(); // สร้าง List เพื่อเก็บจำนวนเฉพาะ
        ListPrime.add(2); // เพิ่มเลข 2 เข้าไปเพราะเป็นจำนวนเฉพาะตัวแรก
        int maxnum = 1000;
        int state = 0;
        for (int i = 2; i < maxnum; i++) { // วนลูปตั้งแต่ 2-N เพื่อหาจำนวนเฉพาะ
            if (i % 2 == 0) {
                continue;
            }
            for (int j = 2; j < i; j++) { // วนลูปเพื่อหาว่าหารลงตัวหรือป่าว
                state = j;
                if (i % j == 0) { // ถ้าหารลงตัวให้หยุดลูป
                    break;
                }
            }
            if (state == i - 1) { // เช็คค่าที่ได้จากลูปว่าลนทุกตัวหรือป่าว ถ้าวนทุกตัวก็เป็นจำนวนเฉพาะ
                                  // ถ้าวนไม่ครบก็ไม่เป็น
                ListPrime.add(i);
            }
        }
        System.out.println(ListPrime.toString());
        System.out.println(ListPrime.size() + " ตัว");
    }
}
