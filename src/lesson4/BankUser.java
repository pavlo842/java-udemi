package lesson4;

public class BankUser {
    public static void main(String[] args) {
        BankAccaunt myAcc = new BankAccaunt();
        BankAccaunt hisAcc = new BankAccaunt();
        BankAccaunt yourAcc = new BankAccaunt();

        BankAccaunt myAcc1 = myAcc;

        myAcc.id = 1;
        myAcc.name = "Pavel";
        myAcc.balance = 35.14;

        hisAcc.id = 2;
        hisAcc.name = "Nata";

        yourAcc.id = 3;
        yourAcc.name = "Alena";

//        System.out.println(myAcc.name + " " + myAcc.balance);
//        System.out.println(hisAcc.balance = 44.14);
//        System.out.println(yourAcc.balance = 156);
        System.out.println(myAcc1.name);

    }
}
