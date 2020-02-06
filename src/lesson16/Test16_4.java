package lesson16;

public class Test16_4 {

}

class Employee {
    double salary;
    boolean isManager;

    Employee(double salary, boolean isManager) {
        this.salary = salary;
        this.isManager = isManager;
    }
}

class TestEmployee {
    public static void main(String[] args) {

        Employee emp = new Employee(10.5, true);

        System.out.println("He manager?" + emp.isManager + " Ego salary" + emp.salary);

    }
}
