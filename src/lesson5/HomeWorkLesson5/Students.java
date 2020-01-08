package lesson5.HomeWorkLesson5;

class StudentTest {
    StudentTest(double aMaS, double aEcS, double aRaForLang) {
        double res = (aMaS + aEcS + aRaForLang) / 3;
//        System.out.println(res);
    }

    double mas;
    double ecs;
    double raf;
}

class StudentTest1 {
    public static void main(String[] args) {
        StudentTest st1 = new StudentTest(6.7, 5.6, 8.8);
    }
}
