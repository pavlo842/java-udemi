package lesson16;

public class Test16_8 {
    public static void main(String[] args) {
        String s1 = "До викторианской эпохи рубаи были практически никому не известны. Именно Эдвард " +
                "Фицджеральд первым начал переводить их сначала на латынь, а позже и на английский язык, " +
                "благодаря чему они быстро разлетелись по Европе. Таким образом гедонизм в стихах Омара Хайяма, " +
                "а также его научные достижения стали объектом интереса для многих ученых и литературоведом того " +
                "времени и современности.";

        String s2 = s1.toUpperCase();
        char c1;
        char c2;
        for (int i = 0; i < s1.length(); i++) {
            c1 = s1.charAt(i);
            c2 = s2.charAt(i);
            if(c1 != ',' && c1 != ' ' && c1 != ':' && c1 != '.' && c1 == c2) {
                System.out.println();
                System.out.print(c1);
                continue;
            }
            System.out.print(c1);
        }
        System.out.println();

    }
}
