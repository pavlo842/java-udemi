package lesson15;

public class Test15_6 {
    public static void main(String[] args) {
        int money = 100;
        do {
            System.out.println("delay stavku");
            System.out.println("your lose");
            money -= 10;
        }
        while (money > 50);
    }
}
