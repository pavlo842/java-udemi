package lesson7.HomeWorkLesson7;

public class Employee {
    private double salary;
    public String surname;
    int id;

    public void showSalaryes() {
        System.out.println(salary);
    }

    public void showSurname() {
        System.out.println(surname);
    }

    public void showId() {
        System.out.println(id);
    }

    public Employee(double salary1) {
        salary = salary1;
    }

    Employee(String surname1) {
        surname = surname1;
    }

    public Employee(int id1) {
        id = id1;
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee emp = new Employee(4565.45);
        Employee emp1 = new Employee("USER");
        Employee emp2 = new Employee(4);
        emp.showSalaryes();
        emp1.showSurname();
        emp2.showId();

    }
}
