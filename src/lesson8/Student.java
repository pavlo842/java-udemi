package lesson8;

public class Student {
    String name;
    int course;
    static int count; // при static запись ведется в данную переменную

    int a;
    static int b;

    public Student(String name2, int course2) {
        count++;
        name = name2;
        course = course2;
        System.out.println("Student # " + count + " create");
    }

    public static void showCount() {
        System.out.println("All students: " + count);
    }

    public void showInfo() {
        System.out.println("Welcome to the student class!!!");
    }

    void abc() {
        a++;
    }

    static void abcd() {
        count++;
        b++;
    }

}

class StudentTest {
    public static void main(String[] args) {
//        Student st1 = new Student("Ivan", 1);
//        Student st2 = new Student("IvanPHHO", 4);
//        Student st3 = new Student("IvanHHHH", 2);
//        System.out.println(Student.count);
//
//        Student.showCount(); // Объект может использовать переменную count

        System.out.println(Student.b); //
    }
}