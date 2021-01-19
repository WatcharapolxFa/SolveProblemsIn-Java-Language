import java.util.Scanner;
import java.util.Random;

public class Blow {
    public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);
        Random random = new Random();
        int playerans, comans;

        System.out.print(" scissor (0) , rock (1) , paper (2) : ");

    }

    public static String ans(int number) {
        String Ans;

        switch (number) {
            case 0:
                Ans = "scissor";
                break;
            case 1:
                Ans = "rock";
                break;
            case 2:
                Ans = "paper";
                break;
            default:
                Ans = "UNIDENTIFIED";
        }

        return Ans;
    }

}
