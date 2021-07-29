abstract class SuperHero {
    private String name;
    private String age;
    private String job;

    public void setName(String name) {
        this.name = name;
    }

    public void setage(String age) {
        this.age = age;
    }

    public abstract void skill(String skill);

}
