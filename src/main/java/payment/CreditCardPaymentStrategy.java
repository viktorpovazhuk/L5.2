package payment;

public class CreditCardPaymentStrategy implements Payment{
    @Override
    public String pay(double price) {
        System.out.println("Payed with Credit");
        return "payed";
    }
}
