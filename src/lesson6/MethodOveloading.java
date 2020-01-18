package lesson6;

public class MethodOveloading {

    void show(int i1) {
        System.out.println(i1);
        System.out.println("Datatype is int");
    }

    void show(int a, int b) {
        System.out.println(a + " " + b);
//        System.out.println(b);
        System.out.println("Datatype is int");
    }

    void show(boolean b1) {
        System.out.println(b1);
        System.out.println("Datatype is bool");
    }

    void show(String s1) {
        System.out.println(s1);
        System.out.println("Datatype is String");
    }

    void show(String s, int a) {
        System.out.println("String :" + s + " int :" + a);
    }

    void show(int a, String s) {
        System.out.println("Good Day");
    }

}

class MethodOveloadingTest {
    public static void main(String[] args) {
        MethodOveloading mO = new MethodOveloading();
        int a = 500;
        mO.show(a);

        boolean b = true;
        mO.show(b);

        String s = "Hello";
        mO.show(s);

        int c = 1500;
        int d = 2500;
        mO.show(c, d);

        mO.show("Hello", 10);
        mO.show(666, "Assle");
    }
}
