package lesson18;

public class Test18_3 {
    public static void main(String[] args) {
        // Introduction to Exceptions
        // ArrayIndexOutOfBoundExeption
        int [] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
//        array[3] = 5;

        // NullPointerException
        int [][] array2 = new int[3][];
        System.out.println(array2[0][1]);
    }
}

1:07