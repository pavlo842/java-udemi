package lesson14;

public class Test14_4 {
    public static void main(String[] args) {
        // loop statements - break
//        for (int i = 1; i <= 10; i++) {
//            if(i == 7) {
//                break;
//            }
//            System.out.println(i);
//        }

        // loop statements - continue
        for (int i = 1; i <= 100; i++) {
            if(i == 10) {
                continue;
            }
            if(i % 55 == 0) {
                break;
            }
            System.out.println(i);
        }
    }
}
