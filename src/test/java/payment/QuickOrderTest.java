package payment;

import delivery.DHLDeliveryStrategy;
import flowerstore.Flower;
import flowerstore.FlowerBucket;
import flowerstore.FlowerPack;
import flowerstore.FlowerType;
import order.Order;
import order.QuickOrder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class QuickOrderTest {
    private Order order;
    private FlowerPack pack;
    private FlowerBucket bucket;

    @BeforeEach
    void setUp() {
        bucket = new FlowerBucket();
        pack = new FlowerPack(new Flower(FlowerType.ROSE), 1000);
        bucket.addPack(pack);
        order = QuickOrder.createOrder(new PayPalPaymentStrategy(), new DHLDeliveryStrategy(), bucket);
    }

    @Test
    void createOrder() {

    }
}