package lesson16;

public class Test16_9 {
    public static void main(String[] args) {
        String s1 = new String("ok");
        String s2 = new String("ok");
        System.out.println(s1 == s2); // false
        System.out.println(s1.equals(s2)); // true

        String s3 = "hello";
        String s4 = "hello";
        System.out.println(s3 == s4); // true
        System.out.println(s3.equals(s4)); // true
        System.out.println(s1 != s4);

        String s5 = "Kak dela?";
        String s6 = "kak dela?";
        System.out.println(s5.equalsIgnoreCase(s6));
    }
}
