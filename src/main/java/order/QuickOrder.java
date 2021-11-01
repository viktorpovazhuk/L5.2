package order;

import delivery.Delivery;
import flowerstore.FlowerBucket;
import payment.Payment;

public class QuickOrder {
    public static Order createOrder(Payment payment, Delivery delivery, FlowerBucket bucket) {
        Order order = new Order();
        order.addItem(bucket);
        order.setPaymentStrategy(payment);
        order.setDeliveryStrategy(delivery);
        return order;
    }
}
