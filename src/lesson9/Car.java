package lesson9;

public class Car {
    String color;
    String engine;
    static int count;

    Car(String color2, String engine2) {
        count++;
        color = color2;
        engine = engine2;
    }

    public void showColor() {
        System.out.println("Color car " + "color");
    }

    public void changeColor(String color3) {
        System.out.println("Color car is empty");
        int cena = 5000;
        color = color3;
        cena += 1000;
    }
}
