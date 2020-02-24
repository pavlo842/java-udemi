package lesson18;

public class Test18_1 {
    public static void main(String[] args) {
        String [] arr1;

        arr1 = new String[3];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = "hello" + i;
//            System.out.println(arr1[i]);
        }

        // создание одномерных массивов в двумерном
        int [] array, a; // array & a - массивы
        int b [], c; // b - массив c - переменная int
        int [] d, e[][]; // d - одномерный массив e - двумерный массив
        int [][] arr2;
        arr2 = new int[3][];
//         _ _ _ _ _
//        |_|_|_|_|_|
//        |_|_|_ _ _ _ _
//        |_|_|_|_|_|_|_|
        arr2[0] = new int[5];
        arr2[1] = new int[2];
        arr2[2] = new int[7];

        // Динамическая инициализация
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                arr2[i][j] = i + j;
                System.out.println(arr2[i][j]);
            }
        }
    }
}
