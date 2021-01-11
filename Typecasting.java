class Typecasting{
    public static void main(String[] args) {
        //Small to Big
        int numInt = 10 ;
        double numDouble = numInt ;
        System.out.println(numInt);
        System.out.println(numDouble);
        // Big to small 
        double numDouble1 = 10.0;
        int numInt1 = (int)numDouble1 ; // fix type
        System.out.println(numInt1);
    }
}