package by.Gorbatsevich.L_24_02_2025;

public class Cash implements PaymenMethod{

    @Override
    public void pay(double amount) {
        System.out.println("оплата " + amount +" наличными ");
    }
}
