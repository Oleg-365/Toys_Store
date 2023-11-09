package ToysPrize;
public class Toy{
    int id;
    String name;
    int count;
    double weight;
    public Toy (int id, String name, int count, double weight) {
        this.id = id;
        this.name = name;
        this.count = count;
        this.weight = weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Игрушка - [id = " + id + ", name = " + name + ", count = " + count +", weight = " + weight + "]" +"\n";
    }
}