public class NestedLoop {
    public static void main(String[] args) {
        for (int i = 0; i <= 3; i++) {
            System.out.println("รอบนอกที่ = " + i);
            for (int j = 0; j <= 5; j++) {
                System.out.println("รอบในที่ = " + j);
            }
        }

    }
}
