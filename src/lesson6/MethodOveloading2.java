package lesson6;

public class MethodOveloading2 {
    public int sum(int i1, int i2) {
        return i1 + i2;
    }

    public String sum(String s1, String s2) {
        return  s1 + s2;
    }

}

class MethodOveloading2Test {
    public static void main(String[] args) {
        MethodOveloading2 mO2 = new MethodOveloading2();

        int a = mO2.sum(5, 7);
        System.out.println(a);

        String s = mO2.sum("Hello,", " my friend");
        System.out.println(s);
    }
}
