package payment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentStrategiesTest {
    private Payment cardStrategy;
    private Payment payPalStrategy;

    @BeforeEach
    void setUp() {
        cardStrategy = new CreditCardPaymentStrategy();
        payPalStrategy = new PayPalPaymentStrategy();
    }

    @Test
    void pay() {
        assertEquals(cardStrategy.pay(100), "payed");
        assertEquals("payed", payPalStrategy.pay(100));
    }
}