package lesson9;

public class Student {
    int a = 10;
    int b = this.a;
    public static int c = 15;
    public int z = this.c;
    static int f = c;
}

class StudentTest {
    public static void main(String[] args) {
        Student st1 = new Student();
        Student st2 = new Student();
        Student st3;

        // прекращение жизни объекта
        // первый вариант
        st1 = null;
        // второй вариант
        // st1 = new Student1(); // перезаписать переменную на новый объект
        

    }
}
