package lesson4;

public class Car {
//    String color = "red";
    // торой вариант обявления переменной и присвоения значения при String
    String color = new String("red");
    String engine = "V6";
}

class CarTest {
    public static void main(String[] args) {
        int a;
        Car car1 = new Car();
        car1.engine = "V8";

        System.out.println(new Car().color);
        System.out.println(car1.engine);
        System.out.println("Color: " + car1.color);
    }
}
