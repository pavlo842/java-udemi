package lesson16;

public class Car {
    String color;
    String engine;

    Car(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }

    final static int a = 5;

    public Car abc(String cvet) {
        Car c10 = new Car(cvet, "V4");
        return c10;
    }

    public static void main(String[] args) {
        Car c = new Car("red", "v6");
        Car c2 = c.abc("black");
        System.out.println(c.color);
        System.out.println(c2.color);
    }

}

/* String = "privet";
* String хранить в массиве класса String в следующем виде
* {final private массив value = {'p', 'r', 'i', 'v', 'e', 't'}}
* */

//class TestCar {
//    final static Car c = new Car("Red", "V8");
//
//    public static void main(String[] args) {
//        c.color = "black"; // изменили цвет
//    }
//}
