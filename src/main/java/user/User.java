package user;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public abstract class User {
    private static int nextId = 0;
    private int id;

    User() {
        this.id = User.nextId;
        User.nextId += 1;
    }

    public abstract void update(String status);
}
