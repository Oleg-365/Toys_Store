package ToysPrize;

import java.util.ArrayList;
import java.util.List;
public class ToysStore {
    public static List<Toy> toys;
    public static  List<Toy> allToys = new ArrayList<>();
    public static List<Toy> prizeToys = new ArrayList<>();


    public ToysStore(List<Toy> toys) {
        ToysStore.toys = toys;
    }

    @Override
    public String toString() {
        return "toys=" + toys ;
    }

    public Toy changeToyWeight() {
        SelectToys select = new SelectToys();
        return select.selectOnWeight(toys);
    }
}
