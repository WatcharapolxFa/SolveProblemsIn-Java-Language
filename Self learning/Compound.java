public class Compound {
    public static void main(String[] args) {
        int x = 10, y = 5;
        System.out.println("ก่อน บวกค่า " + x);
        x += y;
        System.out.println("หลัง บวกค่า " + x);
        x -= y;
        System.out.println("หลัง ลบค่า " + x);
        x *= y;
        System.out.println("หลัง คูณค่า " + x);
        x /= y;
        System.out.println("หลัง หารค่า " + x);
    }

}
