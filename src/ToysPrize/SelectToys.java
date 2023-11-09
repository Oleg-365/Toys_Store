package ToysPrize;

import java.util.List;
public class SelectToys {
    public Toy selectOnWeight(List<Toy> toys) {
        double completeWeight = 0.0;
        for (Toy item : toys)
            completeWeight += item.getWeight();
        double rmd = Math.random() * completeWeight;
        double countWeight = 0.0;
        for (Toy item : toys) {
            countWeight += item.getWeight();
            if (countWeight >= rmd)
                return item;
        }
        throw new RuntimeException("Should never be shown.");
    }
}