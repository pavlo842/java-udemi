package lesson18;

public class Test18 {
    public static void main(String[] args) {
        // Этапы создания массивов
        // 1 Declaration
        int [] array1; // Обявление массива с типом int
        String [] array2; // Обявление массива с типом String
        double [][] array3;  // Обявление двумерного массива с типом double
        int [][] array10;
        double [] array11;
        // ДЛИНА МАССИВА ВСЕГДА int
        array1 = new int[8]; // Создание массива с длинной 8
        array2 = new String[3]; // Создание массива с длинной 3
        array3 = new double[4][2]; // Создание четырех одномерных массива с длинной каждого 2
        array10 = new int[3][]; // Создание три одномерных массива с неопределленой длиной
        array11 = new double[2];
        System.out.println(array2.length);

        // ИНИЦИАЛИЗАЦИЯ
        array2[0] = "hello";
        array2[1] = "good bye";

        array3[0][0] = 3.14;
        array3[2][1] = 3.14;

        double [] array5;
        array5 = new double[2];
        array5[0] = 2.5;
        array5[1] = 3.5;

        array11 = array5;

        array3[1] = array5; // Присвоение одномерного массива двумерному
        System.out.println(array3[1][0]);
    }
}
