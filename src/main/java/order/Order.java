package order;

import delivery.Delivery;
import flowerstore.Item;
import lombok.Getter;
import lombok.Setter;
import payment.Payment;
import user.User;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Getter @Setter
public class Order {
    private LinkedList<Item> items;
    private Payment payment;
    private Delivery delivery;
    private List<User> users = new ArrayList<>();

    public void addUser(User user) {
        users.add(user);
    }

    public void removeUser(User user) {
        users.remove(user);
    }

    public void notifyUsers(String status) {
        for (User user : users) {
            user.update(status);
        }
    }

    public void order() {
        notifyUsers("created");
    }

    public void setPaymentStrategy(Payment payment) {
        this.payment = payment;
    }

    public void setDeliveryStrategy(Delivery delivery) {
        this.delivery = delivery;
    }

    public double calculateTotalPrice() {
        return 0;
    }

    public void processOrder() {

    }

    public void addItem(Item item) {

    }

    public void removeItem(Item item) {

    }
}
