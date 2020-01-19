package lesson8;

import org.w3c.dom.ls.LSOutput;

public class Test1 {
//    public final int a = 10; // Дефолтное значение переменной

    public final int a;

    Test1() {
        a = 10;
    }

    Test1(boolean b) {
        a = 15;
    }

    public void abc(final short s) { // final может быть в параметре
        final byte b; // final м.б. в локальной переменной
        b = 10;
        System.out.println(s + b);
    }

    public static void main(String[] args) {
        Test1 t = new Test1(true);
//        t.a = t.a * 2;
        System.out.println(t.a);
        System.out.println(t.a);
    }

}
