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

    // กรณีรับ 2 ค่า
    public void skill(String language) {
        System.out.println(" Skill = > " + language);

    }

    // กรณีรับค่ามากกว่า แบบไม่รู้จำนวนที่แน่นอน
    public void skill(String... language) {
        for (int i = 0; i < language.length; i++) {
            System.out.println(" Skill = > " + language[i]);
        }

    }
}
