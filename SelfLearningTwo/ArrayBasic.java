public class ArrayBasic {
    public static void main(String[] args) {
        //Array onr miti
        int[] number = new int[4];
        number[0] = 10;
        number[1] = 20;
        number[2] = 30;
        number[3] = 40;
        System.out.println(number[3]);
        float[] avg = new float[5];
        avg[0] = 4.0f;
        avg[1] = 5.0f;
        avg[2] = 5.0f;

        int[] number2 = { 10, 20, 30, 40 };
        int count = number2.length;
        System.out.println(count);
        // แสดงค่าใน Array
        for (int i = 0; i < count; i++) {
            System.out.println(number2[i]);
        }
        int sum = 0;
        String[] fruits = { "มะละกอ ", "มะม่วง", "มะไฟ " };
        for (int data : number) {
            System.out.println(data);
            sum += data;
        }
        System.out.println("ผลรวม" + sum);
    }

}
