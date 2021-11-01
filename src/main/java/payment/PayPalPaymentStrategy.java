package payment;

public class PayPalPaymentStrategy implements Payment {
    @Override
    public String pay(double price) {
        System.out.println("Payed with PayPal");
        return "payed";
    }
}
