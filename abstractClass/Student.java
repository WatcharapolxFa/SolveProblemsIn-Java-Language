abstract class Student {
    private String id;
    private String name;

    public abstract void Register();

    public abstract void Pretest();

    public abstract void Postest();

    public void setId(String id) {
        this.id = id;
    }

    public void setname(String name) {
        this.name = name;
    }

}
