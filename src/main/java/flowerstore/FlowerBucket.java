package flowerstore;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter @Setter @ToString
public class FlowerBucket extends Item {
    List<FlowerPack> flowerPacks = new ArrayList<>();

    public void addPack(FlowerPack flowerPack) {
        flowerPacks.add(flowerPack);
    }

    public double getPrice() {
        double sum = 0;
        for (FlowerPack pack : flowerPacks) {
            sum += pack.getPrice();
        }
        return sum;
    }

    @Override
    public String getDescription() {
        return this.toString();
    }
}
