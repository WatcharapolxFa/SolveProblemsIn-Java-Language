public class main {
    public static void main(String[] args) {

        /* Create Object // สร้างวัตถุ */

        // Employee e1 = new Employee("01", "Watcharapol", 35000.0);

        /* Input Data //ใส่ข้อมูลคนแรก */

        // e1.setId("01");
        // e1.setName("Watcharapol");
        // e1.setSalary("35000");

        /* AlL OUTPUT */

        // e1.disPlayEmployees();

        /* Create Object // สร้างวัตถุ */

        // Employee e2 = new Employee("02", "Wattana", 40000.0);

        // e2.disPlayEmployees();

        /* Input Data //ใส่ข้อมูลคนสอง */

        // e2.setId("02");
        // e2.setName("Wattana");
        // e2.setSalary("37000");

        /* Select OUTPUT */

        // System.out.println(e2.getName());

        /* Static */

        // System.out.println("ชื่อสถารที่ทำงาน >> " + Company.name);

        /* Static method */

        // Company.service();

        /* extends */

        Programmer Program = new Programmer("04", "FaH", 3500.0);
        Program.skill("JAVA");
        Program.bonus();
        Programmer Programs = new Programmer("06", "FaHs", 3550.0);
        Programs.skill("JAVA", "C++");
        Accountant acc = new Accountant("07", "full", 6900.0);

    }

}
