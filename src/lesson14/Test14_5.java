package lesson14;

public class Test14_5 {
        // nested loop - в теле одного loop второй loop
        public void time() {
            OUTER: for (int chas = 0; chas <= 23; chas++) { // label loop
                System.out.println("Start loop");

                INNER: for (int minute = 0; minute <= 59; minute++) {
                    System.out.println(chas + ":" + minute);
                    if(minute == 30) {
                        break OUTER; // использование OUTER label loop
                    }
                }

                System.out.println("End loop");
            }
        }

    public static void main(String[] args) {
        Test14_5 test14_5 = new Test14_5();
        test14_5.time();
    }
}

// OUTER & INNER - задается лэйблы для управления в break & continue
