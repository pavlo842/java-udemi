package lesson5;

public class Method {

    // Шаблонный метод
    int summa(int a, int b, int c) /* input метода - параметры */ {
        int resul = a + b + c;
        return resul; // output метода - тип данных output всегда должен совпадать с типом данных input
        // после return result; НЕЛЬЗЯ БОЛЬШЕ ПИСАТЬ код
    }

    int sredArifm(int a1, int b1, int c1) {
        int result2 = summa(a1, b1, c1) / 3;
        return result2;
    }

}
