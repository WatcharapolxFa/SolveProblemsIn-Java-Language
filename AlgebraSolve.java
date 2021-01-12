
import java.util.Scanner;
class AlgebraSolve{
    public static void main(String[] args) {
        double a , b , c ,  d , e , f;
        double sumx ,sumy ;
        Scanner scanners =  new Scanner(System.in);
        a = scanners.nextDouble();
        b = scanners.nextDouble();
        c = scanners.nextDouble();
        d = scanners.nextDouble();
        e = scanners.nextDouble();
        f = scanners.nextDouble();
        sumx=((e*d)-(b*f))/((a*d)-(b*c));
        sumy=((a*f)-(e*c))/((a*d)-(b*c));
        System.out.println("Sum x : "+sumx);
        System.out.println("Sum y :  "+sumy);
    }
}