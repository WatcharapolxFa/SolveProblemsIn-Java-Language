public class BreakContinue {
    public static void main(String[] args) {
        // Break Continue

        for (int i = 0; i <= 100; i++) {
            if (i == 5)
                break;
            System.out.println(i);
        }
        System.out.println("จบการทำงาน");
        System.out.println("------------");
        System.out.println("------------");
        for (int i = 0; i <= 10; i++) {
            if (i == 5)
                continue;
            System.out.println(i);
        }
        System.out.println("จบการทำงาน");
    }

}