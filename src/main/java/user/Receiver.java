package user;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Receiver extends User {
    public void update(String status) {
        System.out.println("Waited order status: " + status);
    }
}
