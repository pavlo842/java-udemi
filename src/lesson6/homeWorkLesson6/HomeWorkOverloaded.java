package lesson6.homeWorkLesson6;

public class HomeWorkOverloaded {
    void sum() {
        System.out.println("Zero parametr");
    }

    void sum(int one) {
        System.out.println(one);
    }

    void sum(int one, int two) {
        System.out.println(one + two);
    }

    void sum(int one, int two, int three) {
        System.out.println(one + two + three);
    }

    void sum(int one, int two, int three, int four) {
        System.out.println(one + two + three + four);
    }

}

class HomeWorkOverloadedTest {
    public static void main(String[] args) {
        HomeWorkOverloaded hW = new HomeWorkOverloaded();

        hW.sum(1, 2, 10, 10);
    }
}
