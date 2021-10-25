package flowerstore;

import java.util.ArrayList;
import java.util.List;

public class Store {
    List<Flower> flowers = new ArrayList<>();

    public void addFlower(Flower flower) {
        flowers.add(flower);
    }

    public List<Flower> search(int[] color) {
        List<Flower> found = new ArrayList<>();
        for (Flower flower : flowers) {
            if (flower.getColor() == color) {
                found.add(flower);
            }
        }
        return found;
    }
}
