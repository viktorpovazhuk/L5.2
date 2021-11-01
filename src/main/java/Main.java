import db.Connection;
import decorator.PaperDecorator;
import delivery.DHLDeliveryStrategy;
import flowerstore.*;
import order.Order;
import payment.PayPalPaymentStrategy;
import order.QuickOrder;
import user.Sender;
import user.User;

public class Main {
    public static void main(String[] args) {
//        Flower[] flowers = new Flower[3];
//        int[] color = {0, 0, 127};
//        for (int i = 0; i < flowers.length; i++) {
//            flowers[i] = new Flower(FlowerType.ROSE);
//            flowers[i].setColor(color);
//        }
//
//        color[1] = 127;
//
//        for (Flower flower : flowers) {
//            System.out.println(flower);
//        }

//        Item bucket = new FlowerBucket();
//        bucket = new PaperDecorator(bucket);

//        User user1 = new Sender();
//        User user2 = new Sender();
//        System.out.println(user1.getId());
//        System.out.println(user2.getId());
//
//        Connection con1 = Connection.getConnection();
//        Connection con2 = Connection.getConnection();
//        System.out.println(con1 == con2);
//
//        FlowerBucket bucket = new FlowerBucket();
//        FlowerPack pack = new FlowerPack(new Flower(FlowerType.ROSE), 1000);
//        bucket.addPack(pack);
//        Order order = QuickOrder.createOrder(new PayPalPaymentStrategy(), new DHLDeliveryStrategy(), bucket);

        Item bucket = new FlowerBucket();
        FlowerPack pack = new FlowerPack(new Flower(FlowerType.ROSE), 2);
        ((FlowerBucket) bucket).addPack(pack);
        bucket = new PaperDecorator(bucket);
        System.out.println(bucket.getPrice());
    }
}
