import java.util.Scanner;

class CricleArea{
    public static void main(String[] args) {
        double area;

        double radius = 20 ;

        area = radius*radius*3.1459;
        System.out.println("The area for the circle of radius "+radius+"is"+area);
    
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a double value");
        
    }
}