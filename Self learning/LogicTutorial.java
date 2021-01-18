class LogicTutorial {
    public static void main(String[] args) {
        /*
         * 
         * AND && OR || NOT !
         */
        int a = 10, b = 20;

        boolean c = (a == b);
        boolean d = (a < b);

        System.out.println((c && d));
        System.out.println((c || d));
        System.out.println(!(c || d));

    }
}