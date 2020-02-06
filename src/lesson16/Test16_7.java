package lesson16;

public class Test16_7 {
    public static void main(String[] args) {
        // method chaning - методы идут один за другим
        String s1 = "Hello World";
        String s2 = "Yearrrrr!!";
        String s3 = s1.concat(s2).trim().replace("Yearrrrr!!", "Noooooo").substring(6, 10);
        System.out.println(s3);
        System.out.println(s1.substring(s1.indexOf('W')));
    }
}
