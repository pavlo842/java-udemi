package lesson5;

public class Car2 {

    // Контруктор User define
    Car2(String cvet, String motor) {
        color = cvet;
        engine = motor;
        // Можно вывод делать отсюда
        System.out.println(color + " " + engine);
    }

    String color;
    String engine;
    int speed;

    int gaz(int skorost) {
        speed += skorost;
        return speed;
    }

    int tormoz(int skorost) {
        speed -= skorost;
        return speed;
    }

    void showInfo() {
//        System.out.println("Color " + color + " motor " + engine + " skorost " + speed);
    }

}
