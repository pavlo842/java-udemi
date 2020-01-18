package lesson5.HomeWorkLesson5;

public class Employee {
    int id;
    String surname;
    int age;
    double salary;
    String department;

    double incrementSalary () {
        return salary * 2;
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee emp = new Employee();

        emp.salary = 5000;
        System.out.println(emp.incrementSalary());
        emp.salary = 4500;
        System.out.println(emp.incrementSalary());

    }
}
