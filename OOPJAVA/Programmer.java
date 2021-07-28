public class Programmer extends Employee {
    public String skills = "JAVA HTML CSS";

    public Programmer(String id, String name, Double salary) {
        super(id, name, salary);
        System.out.println("I'm programmer");

    }

    // Overloading Method
    public void skill() {
        System.out.println("No Skill");

    }

    public void skill(String language) {
        System.out.println(" Skill = > " + language);

    }

    public void skill(String language, String languages) {
        System.out.println(" Skill = > " + language + " " + languages);

    }
}
