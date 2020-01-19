package lesson7;

public class Employee {

    public double salary;
//    private double salary; // private не видны в другом классе

    public void dvoynayaZP() {
        System.out.println(salary * 2);
    }

    public Employee(double salary2) {
        salary = salary2;
    }

    public static void main(String[] args) {
        Employee emp = new Employee(500);
        System.out.println(emp.salary);
        emp.dvoynayaZP();
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee emp = new Employee(500);
        System.out.println(emp.salary);
        emp.dvoynayaZP();
    }
}