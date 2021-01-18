import java.util.Scanner;
public class ComputingBMI {
    public static void main(String[] args) {

        double weight ;
        System.out.print("Input Weight in pounds : ");
        Scanner scanner=  new Scanner(System.in);
        weight =  scanner.nextDouble();
        double high ;
        System.out.print("Input Height in inches  : ");
        high =  scanner.nextDouble();

        double sumWeight = weight * 0.45359237 ;
        double sumhighs = high * 0.0254;

        double sumBmi=sumWeight/(sumhighs*sumhighs);
        System.out.printf("BMI : %.4f",sumBmi);

    }

}
