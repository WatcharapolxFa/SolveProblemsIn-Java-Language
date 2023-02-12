public class Pattern {
    private int num;

    public Pattern() {

    }

    public Pattern(int newNum) {
        num = newNum;
    }

    public void display() {
        int x = 1;
        int space = num - 2;
        for (int i = 0; i <= num + 1; i++) {
            if (i < num) {
                for (int j = 0; j <= space - i; j++) {
                    System.out.print("  ");
                }
                for (int j = 0; j < (i * 2) - 1; j++) {
                    System.out.print("* ");
                }
            } else {
                for (int j = 0; j < space - (i - num); j++) {
                    System.out.print("  ");
                }
                for (int j = 0; j < (x * 2) - 1; j++) {
                    System.out.print("* ");
                }
                x++;
            }
            System.out.println("");
        }
    }
}