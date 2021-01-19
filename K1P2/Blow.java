import java.util.Scanner;
import java.util.Random;

public class Blow {
    public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);
        Random random = new Random();
        int playerans, comans;
        while (true) {
            System.out.print("scissor (0) , rock (1) , paper (2) : >> ");
            playerans = inputs.nextInt();
            if (playerans > 3 || playerans < 0) {
                System.out.print("Invalid choice (0-3)\n");
                continue;
            }
            comans = random.nextInt(3);
            showWinners(playerans, comans);
        }

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

    public static void showWinners(int playerans, int comans) {

        if (playerans == comans) {
            System.out.printf("The computer is %s. You are %s too. It is a draw\n\n", ans(comans), ans(playerans));
        } else if ((playerans + 1) % 3 == comans) {
            System.out.printf("The computer is %s. You are %s. You lose\n\n", ans(comans), ans(playerans));
        } else {
            System.out.printf("The computer is %s. You are %s. You won\n\n", ans(comans), ans(playerans));
        }
    }
}
