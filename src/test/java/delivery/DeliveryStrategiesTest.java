package delivery;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class DeliveryStrategiesTest {
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    private Delivery dhl, post;

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));

        dhl = new DHLDeliveryStrategy();
        post = new PostDeliveryStrategy();
    }

    @Test
    void deliver() {
        dhl.deliver(null);

        assertEquals("To DHL", outputStreamCaptor.toString()
                .trim());

        outputStreamCaptor.reset();

        post.deliver(null);

        assertEquals("To post", outputStreamCaptor.toString()
                .trim());
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }
}