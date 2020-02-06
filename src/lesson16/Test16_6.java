package lesson16;

public class Test16_6 {
    public static void main(String[] args) {
        String s = "PrIvET:2!";
        // 10. toLowerCase() -> string
        String s2 = s.toLowerCase();
        System.out.println(s2);

        // 11. toUpperCase() -> string
        String s3 = s.toUpperCase();
        System.out.println(s3);

        // 12. contains(String str) -> boolean - проверка содержит ли?
        boolean b = s.contains(":2");
        boolean b1 = s.contains(":45");
        System.out.println(b);
        System.out.println(b1);
    }
}
