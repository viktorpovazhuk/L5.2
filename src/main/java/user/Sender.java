package user;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Sender extends User {
    public void update(String status) {
        System.out.println("Sent order status: " + status);
    }
}
