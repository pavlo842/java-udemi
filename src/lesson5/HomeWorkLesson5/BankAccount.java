package lesson5.HomeWorkLesson5;

public class BankAccount {

    double summaScheta;
    double popolnenieScheta (double popolnenie) {
        summaScheta += popolnenie;
        return summaScheta;
    }

    double snytieSoScheta(double snytie) {
        summaScheta -= snytie;
        return summaScheta;
    }
}

class BankAccountTest {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();
//        System.out.println(bankAccount.popolnenieScheta(25.5));
//        System.out.println(bankAccount.popolnenieScheta(25.5));
//        System.out.println(bankAccount.snytieSoScheta(10));

    }
}
