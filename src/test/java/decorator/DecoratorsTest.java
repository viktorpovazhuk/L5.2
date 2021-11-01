package decorator;

import flowerstore.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecoratorsTest {
    private Item bucket;

    @BeforeEach
    void setUp() {
        bucket = new FlowerBucket();
        FlowerPack pack = new FlowerPack(new Flower(FlowerType.ROSE), 2);
        ((FlowerBucket) bucket).addPack(pack);
        bucket = new PaperDecorator(bucket);
    }

    @Test
    void getPrice() {
        assertEquals(13, bucket.getPrice());
    }

    @Test
    void getDescription() {
        assertEquals("FlowerBucket(flowerPacks=[FlowerPack(flower=Flower(price=0.0, sepalLength=0.0, " +
                "color=null, flowerType=ROSE), amount=2)])with paper", bucket.getDescription());
    }
}