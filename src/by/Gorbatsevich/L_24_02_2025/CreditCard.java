package by.Gorbatsevich.L_24_02_2025;

public class CreditCard implements PaymenMethod {
    private String cardNumber;
    private String cardHolder;


    public CreditCard(String cardNumber, String cardHolder) {
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
    }

    @Override
    public void pay(double amount) {
        System.out.println("оплата " + amount +" с кредитной карты " + cardHolder);
    }
}
