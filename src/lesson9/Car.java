package lesson9;

public class Car {

    int z = 5;

    String color;
    String engine;
    static int count;

    public Car(String color2, String engine2) {
        this.count++;
        this.color = color2;
        this.engine = engine2;
    }

//    public void showColor() {
//        System.out.println("Color car " + color);
//    }
//
//    public void changeColor(String color3) {
//        System.out.println("Color car is empty");
//        int cena = 5000;
//        color = color3;
//        cena += 1000;
//    }

    void changeColor(String color) {
        this.color = color;
        System.out.println(color);
    }

    public static void main(String[] args) {
        Car c = new Car("red", "V6");
        System.out.println(c.color);
        c.changeColor("black");
        System.out.println(c.color);
    }

}
