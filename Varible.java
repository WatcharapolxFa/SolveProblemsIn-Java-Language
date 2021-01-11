class Varible{
    public static void main(String[] args) {
        // Global varible 
        final int number0 ; // Configure
        int number1 = 0 ; // None Configure
        number1 = 90;
        number0 = 50 ;
        //Out put
        System.out.println("ค่าตัวเลขชนิดที่ 1 : "+number1);
        System.out.println("ค่าตัวเลขชนิดที่ 2 : "+number0);
        {
            // Local varible
            int number3 = 10;
            System.out.println("ค่าตัวเลขชนิดที่ 3 : "+number3);
        }
        
    }

}