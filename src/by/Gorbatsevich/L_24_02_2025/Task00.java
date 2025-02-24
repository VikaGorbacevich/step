package by.Gorbatsevich.L_24_02_2025;

import by.Gorbatsevich.L_13_02_2025Vladelec.Bird;
import by.Gorbatsevich.L_13_02_2025Vladelec.Flyable;
import by.Gorbatsevich.L_13_02_2025Vladelec.Swimable;

public class Task00 {
    public static void main(String[] args) {
        PaymenMethod[] paymenMethods = new PaymenMethod[3];
        paymenMethods[0] = new PayPal("VG.gmail.com");
        paymenMethods[1] = new Cash();
        paymenMethods[2] = new CreditCard("2222 0000 3333 1111", "Виктория Горбацевич");

        for (PaymenMethod paymenMethod : paymenMethods) {
            paymenMethod.pay(150.0);
        }
    }
}

