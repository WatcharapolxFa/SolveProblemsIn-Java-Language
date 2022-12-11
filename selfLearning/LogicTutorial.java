class LogicTutorial {
    public static void main(String[] args) {
        /*
         * 
         * AND && OR || NOT !
         */
        int a = 100, b = 200;

        boolean c = (a == b);
        boolean d = (a < b);

        System.out.println((c && d));
        System.out.println((c || d));
        System.out.println(!(c || d));

    }
}