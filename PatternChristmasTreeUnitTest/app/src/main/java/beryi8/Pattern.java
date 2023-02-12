package beryi8;

public class Pattern {
    private int num;

    public Pattern() {

    }

    public Pattern(int newNum) {
        num = newNum;
    }

    public String display() {
        int x = 1;
        int space = num - 2;
        int s1 = space;
        int s2 = space;
        String s = "";
        for (int i = 1; i <= num + 1; i++) {
            if (i < num) {
                for (int j = 0; j <= space - i; j++) {
                    s += "  ";
                }
                s1--;
                for (int j = 0; j < (i * 2) - 1; j++) {
                    s += "* ";
                }
            } else {
                for (int j = 0; j < space - (i - num); j++) {
                    s += "  ";
                }
                s2--;
                for (int j = 0; j < (x * 2) - 1; j++) {
                    s += "* ";
                }
                x++;
            }
            s += "\n";
        }

        return s;
    }
}