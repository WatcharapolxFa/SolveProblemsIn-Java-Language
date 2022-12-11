public class SummationLoop {
    public static void main(String[] args) {
        int number = 1;
        int sum = 0;
        while (number <= 5) {
            System.out.println(number);
            sum += number;
            number++;

        }
        System.out.println("ผลรวมมีค่าเท่ากับ >> " + sum);
    }

}