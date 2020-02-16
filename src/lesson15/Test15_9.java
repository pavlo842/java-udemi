package lesson15;

public class Test15_9 {
    public static void main(String[] args) {
        OUTER:
        for (int hour = 0; hour < 24; hour++) {
            int minute = 0;
            INNER:
            while (minute < 60) {
                if (minute < 10) {
                    System.out.println(hour + ":0" + minute);
                } else {
                    System.out.println(hour + ":" + minute);
                }
                minute++;
            }
        }
    }
}
