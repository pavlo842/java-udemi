package lesson6;

public class Employee {

    Employee(int id2, String surname2, int age2) {
//        this(surname2, age2);
//        id = id2;

        // ПРАВИЛЬНЫЙ ВАРИАНТ ОПИСАНИЯ КОНСТРУКТОРА
        this(id2, surname2, age2, 0.0, null);
    }

    public Employee(String surname3, int age3) {
//        surname = surname3;
//        age = age3;

        // ПРАВИЛЬНЫЙ ВАРИАНТ ОПИСАНИЯ КОНСТРУКТОРА
        this(0, surname3, age3, 0.0, null);
    }

    Employee(int id4, String surname4, int age4, double salary4, String department4) {
//        this(id4, surname4, age4); // this должен быть вызван первым в теле конструктора
//        salary = salary4;
//        department = department4;

        // ПРАВИЛЬНЫЙ ВАРИАНТ ОПИСАНИЯ КОНСТРУКТОРА
        id = id4;
        surname = surname4;
        age = age4;
        salary = salary4;
        department = department4;
    }

    int id;
    String surname;
    int age;
    double salary;
    String department;
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Pallo", 25);
        System.out.println(emp1.surname);
        Employee emp3 = new Employee(1, "Pallo", 25, 100.35, "IT");
        System.out.println(emp3.department);
    }
}
