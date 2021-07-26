class Employee {
    // Attribute
    private String id;
    private String name;
    private String salary;

    // Default Constructor
    public Employee() {
        System.out.println("Create Object Completed");
    }

    // Methods

    public void setId(String id) {
        this.id = id;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public void disPlayEmployees() {
        System.out.println("ID =>" + this.id);
        System.out.println("NAME =>" + this.name);
        System.out.println("Salary =>" + this.salary);
    }

    // OUTPUT
    public String getName() {
        return this.name;
    }

    public String getSalary(String salary) {
        return this.salary;
    }

}