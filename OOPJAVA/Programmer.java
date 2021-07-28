public class Programmer extends Employee {
    public String skills = "JAVA HTML CSS";

    public Programmer(String id, String name, Double salary) {
        super(id, name, salary);
        System.out.println("I'm programmer");

    }
}
