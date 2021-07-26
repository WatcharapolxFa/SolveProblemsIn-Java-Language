public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee();// Create Object

        e1.setId("01");
        e1.setName("Watcharapol");
        e1.setSalary("35000");
        e1.disPlayEmployees(); // AlL OUTPUT

        Employee e2 = new Employee();// Create Object
        e2.setId("02");
        e2.setName("Wattana");
        e2.setSalary("37000");
        System.out.println(e2.getName()); // OUTPUT Select

    }

}
