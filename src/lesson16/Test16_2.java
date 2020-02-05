package lesson16;

public class Test16_2 {
    public static void main(String[] args) {

//        String s3 = new String("privet");
        String s3 = new String("abcdefgabcd");

        // 1. length() -> int - длина возвращает int
        int a = s3.length();
        System.out.println(s3.length());
        System.out.println(a);


        // 2. charAt(int index) -> char - возвращает char
        char b = s3.charAt(3);
        System.out.println(b);


        // 3. indexOf() -> int. Если не найдено то вернется -1. Повторяющиеся символы выводят 0
        int i1 = s3.indexOf('t'); // Если не найдено то вернется -1
        System.out.println(i1);

        int i1_1 = s3.indexOf("t"); // Если не найдено то вернется -1
        System.out.println(i1_1);

        int i2 = s3.indexOf("vet"); // Если не найдено то вернется -1
        System.out.println(i2);

        int i3 = s3.indexOf("a", 5); // Если есть повторяющиеся символы то задать поиск символа "a" с 5 индекса
        System.out.println(i3);

        int i3_1 = s3.indexOf('a', 5); // Если есть повторяющиеся символы то задать поиск символа "a" с 5 индекса
        System.out.println(i3_1);


        // 4. startsWith(string prefix) -> boolean
        //    startsWith(string prefix, int from) -> boolean
        boolean i4 = s3.startsWith("abc"); // Проерка о наличии в стринге фразы abc - возвращает true если найдено
        System.out.println(i4);

        boolean i4_1 = s3.startsWith("abc", 7); // Проерка о наличии в стринге фразы abc начиная с индекса 7 - возвращает true если найдено
        System.out.println(i4_1);


        // 5. endsWith(String suffix) -> boolean
        boolean i5 = s3.endsWith("abc"); // Проерка о наличии в конце стринга фразы abc - возвращает true если найдено
        System.out.println(i5);

    }
}
