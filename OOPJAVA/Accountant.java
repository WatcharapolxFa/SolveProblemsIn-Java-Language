public class Accountant extends Employee {
    public String skills = "Manage Money";

    public Accountant(String id, String name, Double salary) {
        super(id, name, salary);
        System.out.println("I'm Accountant");

    }

    public void bonus() {
        System.out.println("Bonus = 20 % ");
    }
}