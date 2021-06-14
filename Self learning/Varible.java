class Varible {
    public static void main(String[] args) {

        int num1;
        float num2;
        char alphabet;

        int numnum1 = 10;
        float numnum2 = 20.0f;
        char alphabets = 'F';

        double z = 0.00, x = 10.0, v = 25.0;

        // System.out.println("ค่าตัวเลขชนิดที่ 1 : " + numnum2);

        // Global varible
        final int number0; // Configure
        int number1 = 0; // None Configure
        int number2 = 500;
        number1 = 90;
        number0 = 50;
        // Out put
        System.out.println("ค่าตัวเลขชนิดที่ 1 : " + number1);
        System.out.println("ค่าตัวเลขชนิดที่ 2 : " + number0);
        System.out.println("ค่าตัวเลข :" + number2);
        {
            // Local varible
            int number3 = 10;
            System.out.println("ค่าตัวเลขชนิดที่ 3 : " + number3);
        }

    }

}