package by.Gorbatsevich.L_24_02_2025;

public class PayPal implements PaymenMethod {
    private String email;

    public PayPal(String email) {
        this.email = email;
    }


    @Override
    public void pay(double amount) {
        System.out.println("оплата " + amount +" аккаунт " + email);
    }
}
