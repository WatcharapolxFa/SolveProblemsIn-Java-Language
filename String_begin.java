public class String_begin {
    public static void main(String[] args) {
        String a = "10";
        System.out.println(a);
        String b = "80";
        System.out.println(b);
        


        // String >> int 

        int fa ;
        fa = Integer.parseInt(a);
        fa = fa + 15;
        System.out.println(fa);

        //String >> Double
        
        double fah ;
        fah = Double.parseDouble(b);
        fah = fah +25.00;
        System.out.println(fah);

        // Integer >> String

        int num1 = 100;
        String age = String.valueOf(num1);
        System.out.println(age);

        //Check type
    }
}
