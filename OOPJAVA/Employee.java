class Employee {
    // Attribute //แม่แบบ
    private String id;
    private String name;
    private Double salary;

    // Default Constructor

    public Employee() {

    }

    public Employee(String id, String name) {

    }

    // Custom Constructor
    public Employee(String id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        disPlayEmployees();

    }

    // Methods //set การใส่ข้อมูล

    public void setId(String id) {
        this.id = id;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    // แสดงค่าออกทาง Terminal
    public void disPlayEmployees() {
        System.out.println("--------------------------------");
        System.out.println("NAME =>   " + this.name);
        System.out.println("Salary => " + this.salary);
    }

    // OUTPUT // นำผลออกมาแสดงโดยส่งไปใน disPlayEmployees()

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Double getSalary(Double salary) {
        return this.salary;
    }

    public void bonus() {
        System.out.println("Bonus = 10 % ");
    }

}