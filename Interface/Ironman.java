class Ironman extends SuperHero implements SkillHero {

    private String skill;

    public void skill(String skill) {
        System.out.println("Skill  =  " + skill);

    }

    public void moving(String moving) {
        System.out.println("Moving  =  40 Km/Hr" + moving);
    }

    public void weapon(String weapon) {
        System.out.println("Weapon  = intelligence " + weapon);
    }
}
