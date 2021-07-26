class Employee {
    // Attribute
    private String id;
    private String name;
    private Double salary;

    // Default Constructor
    public Employee() {
        System.out.println("Create Object Completed");
        this.id = "01";
        this.name = "Watcharapol Yotadee";
        this.salary = 350000.0;
    }

    // Methods

    public void setId(String id) {
        this.id = id;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void disPlayEmployees() {
        System.out.println("ID =>    " + this.id);
        System.out.println("NAME =>   " + this.name);
        System.out.println("Salary => " + this.salary);
    }

    // OUTPUT
    public String getName() {
        return this.name;
    }

    public Double getSalary(Double salary) {
        return this.salary;
    }

}